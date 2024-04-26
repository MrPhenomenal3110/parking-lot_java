package org.premshah.parkinglot_java.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle {
    private String licensePlate;
    private VehicleType type;
    private String ownerName;

}
