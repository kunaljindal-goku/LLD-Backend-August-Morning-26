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

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getAssignedSpot() {
        return assignedSpot;
    }

    public void setAssignedSpot(ParkingSpot assignedSpot) {
        this.assignedSpot = assignedSpot;
    }

    public ParkingFloor getAssignedFloor() {
        return assignedFloor;
    }

    public void setAssignedFloor(ParkingFloor assignedFloor) {
        this.assignedFloor = assignedFloor;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
