package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.PaymentGateway;
import com.scaler.BookMyShow.models.enums.PaymentMode;
import com.scaler.BookMyShow.models.enums.PaymentStatus;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SoftDelete;

@Getter
@Setter
public class Payment extends BaseEntity{

    private double amount;
    private PaymentGateway paymentGateway;
    private PaymentStatus status;
    private PaymentMode paymentMode;
}
