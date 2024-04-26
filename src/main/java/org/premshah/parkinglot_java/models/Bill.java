package org.premshah.parkinglot_java.models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Bill extends BaseModel {
    private Ticket ticket;
    private Date exitTime;
    private double amount;
    private Gate gate;
    private List<Payment> payments;
    private BillStatus billStatus;
    private Operator operator;
}
