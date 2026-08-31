package model;

import model.enums.PaymentMode;
import model.enums.PaymentStatus;

import javax.xml.stream.events.DTD;
import java.util.Date;

public class Payment extends BaseEntity{

    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private String referenceNumber;
    private Date paymentTime;
    private double amount;
}
