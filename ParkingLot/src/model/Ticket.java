package model;

import java.util.Date;

public class Ticket extends BaseEntity{

    private String ticketNumber;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot assignedSpot;
    private ParkingFloor assignedFloor;
    private Gate entryGate;
    private Operator operator;
}
