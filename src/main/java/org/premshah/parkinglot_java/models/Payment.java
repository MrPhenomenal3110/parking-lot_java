package org.premshah.parkinglot_java.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Payment extends BaseModel{
    private PaymentMode paymentMode;
    private double amount;
    private Date paymentTime;
    private PaymentStatus status;
    private String referenceId;

}