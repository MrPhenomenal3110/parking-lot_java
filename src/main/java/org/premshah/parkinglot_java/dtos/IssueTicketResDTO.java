package org.premshah.parkinglot_java.dtos;

import lombok.Getter;
import lombok.Setter;
import org.premshah.parkinglot_java.models.Ticket;

@Getter
@Setter
public class IssueTicketResDTO {
    private Ticket ticket;
    private ResponseStatus responseStatus;
}

