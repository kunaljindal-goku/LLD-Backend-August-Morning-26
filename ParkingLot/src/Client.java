import controller.TicketController;
import dto.request.IssueTicketRequestDto;
import dto.response.IssueTicketResponseDto;
import model.Gate;
import model.Operator;
import model.ParkingFloor;
import model.ParkingSpot;
import model.enums.GateStatus;
import model.enums.GateType;
import model.enums.ParkingSpotStatus;
import model.enums.VehicleType;
import repository.GateRepository;
import repository.ParkingSpotRepository;
import repository.VehicleRepository;
import service.TicketService;
import strategy.NearestSpotStrategy;
import strategy.SlotAssignmentStrategy;

import java.util.List;
import java.util.SortedMap;
import java.util.concurrent.locks.ReadWriteLock;

public class Client {

    public static void main(String[] args) {
       GateRepository gateRepository = new GateRepository();
       SlotAssignmentStrategy assignmentStrategy = new NearestSpotStrategy();
       VehicleRepository vehicleRepository = new VehicleRepository();
       ParkingSpotRepository spotRepository = new ParkingSpotRepository();

       // dummy gates
        gateRepository.save(new Gate("1A", GateType.ENTRY,new Operator(), GateStatus.OPEN));

        // dummy spots
        spotRepository.save(new ParkingSpot("S1",
                List.of(VehicleType.THREE_WHEELER,VehicleType.TWO_WHEELER),
                ParkingSpotStatus.EMPTY,
                new ParkingFloor()));

        TicketService ticketService = new TicketService(gateRepository,assignmentStrategy,
                vehicleRepository,spotRepository);

        TicketController controller = new TicketController(ticketService);

        IssueTicketRequestDto request = new IssueTicketRequestDto();
        request.setGateId(1);
        request.setOwnerName("Tony Stark");
        request.setVehicleNumber("STARK 123");
        request.setVehicleType(VehicleType.THREE_WHEELER);

        IssueTicketResponseDto response = controller.issueTicket(request);
        System.out.println(response.getMessage());
        System.out.println("Spot assigned = "+response.getSpotNumber());
        System.out.println("Ticket number = "+response.getTicketNumber());

        IssueTicketRequestDto request2 = new IssueTicketRequestDto();
        request2.setGateId(1);
        request2.setOwnerName("Steve Rogers");
        request2.setVehicleNumber("CAP 123");
        request2.setVehicleType(VehicleType.THREE_WHEELER);

        IssueTicketResponseDto response2 = controller.issueTicket(request2);
        System.out.println(response2.getMessage());
        System.out.println("Spot assigned = "+response2.getSpotNumber());
        System.out.println("Ticket number = "+response2.getTicketNumber());

    }
}
