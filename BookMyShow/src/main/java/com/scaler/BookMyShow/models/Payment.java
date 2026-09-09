package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.PaymentGateway;
import com.scaler.BookMyShow.models.enums.PaymentMode;
import com.scaler.BookMyShow.models.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SoftDelete;

@Getter
@Setter
@Entity
public class Payment extends BaseEntity{

    private double amount;

    @Enumerated(value = EnumType.STRING)
    private PaymentGateway paymentGateway;

    @Enumerated(value = EnumType.STRING)
    private PaymentStatus status;

    @Enumerated(value = EnumType.STRING)
    private PaymentMode paymentMode;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
