package model;

import model.enums.ParkingSpotStatus;
import model.enums.VehicleType;

public class ParkingSpot extends BaseEntity{

    String spotNumber;
    VehicleType vehicleType;
    ParkingSpotStatus parkingSpotStatus;
}
