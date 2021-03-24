package com.endava.vehicle;

import com.endava.vehicle.train.Train;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.*;
public class VehicleTest {
    @Test
    public void equalsHashCodeContracts() {
        EqualsVerifier.forClass(Train.class).verify();
    }
}