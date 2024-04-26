package org.premshah.parkinglot_java.dtos;


import lombok.Getter;
import lombok.Setter;
import org.premshah.parkinglot_java.models.VehicleType;

@Getter
@Setter
public class IssueTicketReqDTO {
    private Long gateId;
    private VehicleType vehicleType;
    private String registrationNumber;
    private String owner;
}
