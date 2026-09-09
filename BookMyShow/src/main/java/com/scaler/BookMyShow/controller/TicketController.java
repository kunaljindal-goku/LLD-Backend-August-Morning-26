package com.scaler.BookMyShow.controller;

import com.scaler.BookMyShow.dto.BookTicketRequestDto;
import com.scaler.BookMyShow.dto.BookTicketResponseDto;
import com.scaler.BookMyShow.models.Ticket;
import com.scaler.BookMyShow.models.enums.ResponseStatus;
import com.scaler.BookMyShow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public BookTicketResponseDto bookTicket(BookTicketRequestDto request) {
        BookTicketResponseDto response = new BookTicketResponseDto();
       try{
           Ticket ticket = ticketService.bookTicket(request.getUserId(),
                   request.getShowId(), request.getSeatIds());
           response.setBookingId(ticket.getTicketNumber());
           response.setAmount(ticket.getAmount());
           response.setStatus(ResponseStatus.SUCCESS);
       }
       catch (Exception e) {
           response.setStatus(ResponseStatus.FAILED);
       }
       return response;
   }
}
