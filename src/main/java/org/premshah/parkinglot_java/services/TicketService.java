package org.premshah.parkinglot_java.services;

import org.premshah.parkinglot_java.exceptions.GateNotFoundException;
import org.premshah.parkinglot_java.models.Gate;
import org.premshah.parkinglot_java.models.Ticket;
import org.premshah.parkinglot_java.models.VehicleType;
import org.premshah.parkinglot_java.repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gate;

    public TicketService(GateRepository gate) {
        this.gate = gate;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gate.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        return null;
    }
}
