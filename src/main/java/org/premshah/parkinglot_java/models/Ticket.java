package org.premshah.parkinglot_java.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Ticket extends BaseModel{
    private String number;
    private Date entryTime;
    private  Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate generatedAt;
    private Operator generatedBy;

}
