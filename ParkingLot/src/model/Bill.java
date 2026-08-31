package model;

import model.enums.BillStatus;

import java.util.Date;
import java.util.List;

public class Bill extends BaseEntity{

    private Ticket ticket;
    private Date exitTime;
    private double amount;
    private Gate exitGate; // gate at which bill was generated
    private Operator operator;
    private BillStatus billStatus;
    private List<Payment> payments;  // partial and failed payments
}
