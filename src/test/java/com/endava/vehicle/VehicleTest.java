package com.endava.vehicle;

import com.endava.vehicle.train.Train;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import static org.junit.Assert.*;
public class VehicleTest {
    @Test
    public void equalsHashCodeContracts() {
        EqualsVerifier.forClass(Train.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }
}