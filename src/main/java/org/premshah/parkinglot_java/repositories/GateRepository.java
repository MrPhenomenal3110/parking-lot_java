package org.premshah.parkinglot_java.repositories;

import org.premshah.parkinglot_java.models.Gate;

import java.util.*;

public class GateRepository {
    private Map<Long, Gate> gates = new HashMap<>();

    public Optional<Gate> findById(Long gateId) {
        if (gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}
