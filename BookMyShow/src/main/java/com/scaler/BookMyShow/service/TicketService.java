package com.scaler.BookMyShow.service;

import com.scaler.BookMyShow.models.Show;
import com.scaler.BookMyShow.models.Ticket;
import com.scaler.BookMyShow.models.User;
import com.scaler.BookMyShow.respository.ShowRepository;
import com.scaler.BookMyShow.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private UserRepository userRepository;
    private ShowRepository showRepository;

    @Autowired
    public TicketService(UserRepository userRepository,
                         ShowRepository showRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
    }

    public Ticket bookTicket(int userId,
                             int showId,
                             List<Integer> showSeatIds) {

//        Optional<User> userOptional = userRepository.findById(userId);
//        if(userOptional.isEmpty()) {
//            throw new RuntimeException("Invalid user id");
//        }
//
//        User user = userOptional.get();

       User user = userRepository.findById(userId)
               .orElseThrow(() -> new RuntimeException("Invalid user Id"+userId));
       Show show = showRepository.findById(showId).orElseThrow();

       return null;
    }
}
