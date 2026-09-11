package com.scaler.BookMyShow.service;

import com.scaler.BookMyShow.models.Show;
import com.scaler.BookMyShow.models.ShowSeat;
import com.scaler.BookMyShow.models.Booking;
import com.scaler.BookMyShow.models.User;
import com.scaler.BookMyShow.models.enums.BookingStatus;
import com.scaler.BookMyShow.models.enums.SeatStatus;
import com.scaler.BookMyShow.respository.BookingRepository;
import com.scaler.BookMyShow.respository.ShowRepository;
import com.scaler.BookMyShow.respository.ShowSeatRepository;
import com.scaler.BookMyShow.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class BookingService {

    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private static final int MAX_SEAT_COUNT = 10;
    private PriceCalculator priceCalculator;
    private BookingRepository bookingRepository;

    @Autowired
    public BookingService(UserRepository userRepository,
                          ShowRepository showRepository,
                          ShowSeatRepository showSeatRepository,
                          PriceCalculator priceCalculator,
                          BookingRepository bookingRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.priceCalculator = priceCalculator;
        this.bookingRepository = bookingRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(int userId,
                              int showId,
                              List<Integer> showSeatIds) {

       User bookedBy = userRepository.findById(userId)
               .orElseThrow(() -> new RuntimeException("Invalid user Id"+userId));
       Show bookedShow = showRepository.findById(showId).orElseThrow();
       if(showSeatIds.size() > MAX_SEAT_COUNT) {
           throw new RuntimeException("Max 10 seats are allowed in a single booking");
       }

       List<ShowSeat> bookedShowSeats = showSeatRepository.findAllById(showSeatIds);
       for(ShowSeat showSeat: bookedShowSeats) {
           boolean isAvailable = showSeat.getStatus().equals(SeatStatus.EMPTY);
           boolean isExpired = showSeat.getStatus().equals(SeatStatus.BLOCKED) &&
                   Duration.between(new Date().toInstant(),showSeat.getBlockedAt().toInstant()).toMinutes() > 15;

           if(!(isAvailable || isExpired)) {
               throw new RuntimeException("Seat"+ showSeat.getId()+" already blocked");
           }
       }

       // SOFT BLOCK
        List<ShowSeat> savedShowSeats = new ArrayList<>();
       for(ShowSeat showSeat: bookedShowSeats) {
           showSeat.setStatus(SeatStatus.BLOCKED);
           showSeat.setBlockedAt(new Date());
           savedShowSeats.add(showSeatRepository.save(showSeat));
       }

       // create booking
        Booking booking = new Booking();
       booking.setTicketNumber(String.valueOf(UUID.randomUUID()));
       booking.setBookingStatus(BookingStatus.PENDING);
       booking.setAmount(priceCalculator.calculatePrice(bookedShow,savedShowSeats));
       booking.setUser(bookedBy);
       booking.setBookedShowSeats(savedShowSeats);
       booking.setShow(bookedShow);
       booking.setPayments(new ArrayList<>());

       Booking savedBooking = bookingRepository.save(booking);
       return savedBooking;
    }
}
