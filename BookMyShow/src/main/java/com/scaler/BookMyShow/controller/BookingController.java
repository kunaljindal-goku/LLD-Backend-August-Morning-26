package com.scaler.BookMyShow.controller;

import com.scaler.BookMyShow.dto.BookTicketRequestDto;
import com.scaler.BookMyShow.dto.BookTicketResponseDto;
import com.scaler.BookMyShow.models.Booking;
import com.scaler.BookMyShow.models.enums.ResponseStatus;
import com.scaler.BookMyShow.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {

    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookTicketResponseDto bookTicket(BookTicketRequestDto request) {
        BookTicketResponseDto response = new BookTicketResponseDto();
       try{
           Booking booking = bookingService.bookTicket(request.getUserId(),
                   request.getShowId(), request.getSeatIds());
           response.setBookingId(booking.getTicketNumber());
           response.setAmount(booking.getAmount());
           response.setStatus(ResponseStatus.SUCCESS);
       }
       catch (Exception e) {
           response.setStatus(ResponseStatus.FAILED);
       }
       return response;
   }
}
