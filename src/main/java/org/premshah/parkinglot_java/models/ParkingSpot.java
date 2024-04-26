package org.premshah.parkinglot_java.models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class ParkingSpot {
    private int spotNumber;
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus status;
    private  ParkingLevel floor;
}
