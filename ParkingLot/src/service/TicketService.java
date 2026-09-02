package service;

import dto.request.IssueTicketRequestDto;
import exceptions.GateNotFoundException;
import exceptions.SlotNotAvailableException;
import model.Gate;
import model.ParkingSpot;
import model.Ticket;
import model.Vehicle;
import model.enums.GateType;
import model.enums.ParkingSpotStatus;
import repository.GateRepository;
import repository.ParkingSpotRepository;
import repository.VehicleRepository;
import strategy.SlotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

public class TicketService {

    private final GateRepository gateRepository;
    private final SlotAssignmentStrategy assignmentStrategy;
    private final VehicleRepository vehicleRepository;
    private final ParkingSpotRepository spotRepository;

    public TicketService(GateRepository gateRepository,
                         SlotAssignmentStrategy assignmentStrategy,
                         VehicleRepository vehicleRepository,
                         ParkingSpotRepository spotRepository) {
        this.gateRepository = gateRepository;
        this.assignmentStrategy = assignmentStrategy;
        this.vehicleRepository = vehicleRepository;
        this.spotRepository = spotRepository;
    }

    public Ticket issueTicket(IssueTicketRequestDto request) {
        // step 1. validations
        Optional<Gate> gateOptional = gateRepository.findById(request.getGateId());
        if(gateOptional.isEmpty()) {
            throw new GateNotFoundException("Invalid gate id: "+request.getGateId());
        }

        Gate gate = gateOptional.get();
        if(!gate.getGateType().equals(GateType.ENTRY)) {
            throw new RuntimeException("Entry is not allowed through exit gate");
        }

        // Step 2 - Save Vehicle info
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNumber(request.getVehicleNumber());
        vehicle.setOwnerName(request.getOwnerName());
        vehicle.setVehicleType(request.getVehicleType());
        Vehicle savedVehicle = vehicleRepository.save(vehicle);

        // Step 3 - Slot assignment
        Optional<ParkingSpot> optionalParkingSpot = assignmentStrategy
                .assignSpot(spotRepository.findAll(), request.getVehicleType());
        if(optionalParkingSpot.isEmpty()) {
            throw new SlotNotAvailableException("Sorry! No slots available at the moment");
        }

        ParkingSpot assignedSpot = optionalParkingSpot.get();
        assignedSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        spotRepository.save(assignedSpot);

        // Step 4 - Issue ticket
        Ticket ticket = new Ticket();
        ticket.setTicketNumber(String.valueOf(UUID.randomUUID()));
        ticket.setEntryTime(new Date());
        ticket.setVehicle(savedVehicle);
        ticket.setAssignedSpot(assignedSpot);
        ticket.setAssignedFloor(assignedSpot.getParkingFloor());
        ticket.setEntryGate(gate);
        ticket.setOperator(gate.getOperator());

        return ticket;
    }
}
