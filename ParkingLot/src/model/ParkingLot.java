package model;

import model.enums.VehicleType;

import java.util.List;

public class ParkingLot extends BaseEntity{

    List<ParkingFloor> floors;
    List<Gate> gates;
    ParkingLotStatus parkingLotStatus;
    SlotAssignmentStrategy slotAssignmentStrategy;
    FeeCalculationStratgey feeCalculationStratgey;
    List<VehicleType> allowedVehicleTypes;


}
