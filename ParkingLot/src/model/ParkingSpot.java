package model;

import model.enums.ParkingSpotStatus;
import model.enums.VehicleType;

public class ParkingSpot extends BaseEntity{

    private String spotNumber;
    private VehicleType vehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingFloor parkingFloor; // bi-directional relationship between floor and spot
}

