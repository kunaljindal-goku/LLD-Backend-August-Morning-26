package strategy;

import model.ParkingSpot;
import model.enums.ParkingSpotStatus;
import model.enums.VehicleType;

import java.util.List;
import java.util.Optional;

public class NearestSpotStrategy implements SlotAssignmentStrategy{
    @Override
    public Optional<ParkingSpot> assignSpot(List<ParkingSpot> spots,
                                            VehicleType vehicleType) {
        for(ParkingSpot spot: spots) {
            if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
            spot.getVehicleTypes().contains(vehicleType)) {
                return Optional.of(spot);
            }
        }
        return Optional.empty();
    }
}
