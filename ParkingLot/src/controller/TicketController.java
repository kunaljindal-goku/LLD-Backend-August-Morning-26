package controller;

import dto.request.IssueTicketRequestDto;
import dto.response.IssueTicketResponseDto;
import model.Ticket;
import model.enums.HttpStatusCode;
import service.TicketService;

public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto request) {
        IssueTicketResponseDto response = new IssueTicketResponseDto();
        try {
            Ticket ticket = ticketService.issueTicket(request);
            response.setEntryGate(ticket.getEntryGate().getGateName());
            response.setTicketNumber(ticket.getTicketNumber());
            response.setSpotNumber(ticket.getAssignedSpot().getSpotNumber());
            response.setMessage("Ticket generated successfully");
            response.setStatusCode(HttpStatusCode.SUCCESS);
        } catch (Exception e) {
            // in prod, we use controller advice for exception handling
            response.setMessage("Ticket generation failed: " + e.getMessage());
            response.setStatusCode(HttpStatusCode.FAILURE);
        }
        return response;
    }
}
