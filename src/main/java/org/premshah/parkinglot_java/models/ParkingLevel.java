package org.premshah.parkinglot_java.models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class ParkingLevel {
    private int floorNumber;
    private List<ParkingSpot> spots;
    private ParkingFloorStatus parkingFloorStatus;
}
