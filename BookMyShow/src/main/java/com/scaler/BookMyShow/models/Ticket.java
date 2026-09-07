package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.TicketStatus;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Ticket extends BaseEntity{

    private String ticketNumber;
    private TicketStatus ticketStatus;
    private double amount;

    private User user;

    @ManyToMany
    @JoinTable
    private List<ShowSeat> bookedShowSeats;

    private Show show;
    private List<Payment> payments;
}
