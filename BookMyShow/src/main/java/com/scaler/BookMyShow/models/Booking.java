package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseEntity{

    private String ticketNumber;
    private BookingStatus bookingStatus;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(name = "ticket_show_seats")
    private List<ShowSeat> bookedShowSeats;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payments;
}
