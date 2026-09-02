package strategy;

import model.ParkingSpot;
import model.enums.VehicleType;

import java.util.List;
import java.util.Optional;

public interface SlotAssignmentStrategy {

    Optional<ParkingSpot> assignSpot(List<ParkingSpot> spots, VehicleType vehicleType);
}
