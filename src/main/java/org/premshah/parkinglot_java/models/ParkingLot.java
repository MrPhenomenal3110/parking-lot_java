package org.premshah.parkinglot_java.models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Getter
@Setter
public class ParkingLot extends BaseModel {
    private List<ParkingLevel> parkingFloors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypes;
}
