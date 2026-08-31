package model;

import model.enums.ParkingLotStatus;
import model.enums.VehicleType;
import strategy.FeeCalculationStrategy;
import strategy.SlotAssignmentStrategy;

import java.util.List;

public class ParkingLot extends BaseEntity{

    private List<ParkingFloor> floors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private SlotAssignmentStrategy slotAssignmentStrategy;
    private FeeCalculationStrategy feeCalculationStrategy;
    private List<VehicleType> allowedVehicleTypes;


}
