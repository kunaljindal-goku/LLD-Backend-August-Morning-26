package model;

import model.enums.ParkingSpotStatus;
import model.enums.VehicleType;

import java.util.List;

public class ParkingSpot extends BaseEntity{

    private String spotNumber;
    private List<VehicleType> vehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingFloor parkingFloor; // bi-directional relationship between floor and spot

    public ParkingSpot(String spotNumber, List<VehicleType> vehicleTypes, ParkingSpotStatus parkingSpotStatus, ParkingFloor parkingFloor) {
        this.spotNumber = spotNumber;
        this.vehicleTypes = vehicleTypes;
        this.parkingSpotStatus = parkingSpotStatus;
        this.parkingFloor = parkingFloor;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(String spotNumber) {
        this.spotNumber = spotNumber;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}

