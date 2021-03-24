package com.endava.vehicle.plane;

import com.endava.enums.Brand;
import com.endava.vehicle.Vehicle;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Plane extends Vehicle {

    @Override
    public String toString() {
        return "The plane is a " + super.getBrand() +
                " with capacity of " + super.getCapacity();
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Vehicle vehicle = (Plane) o;
        return getCapacity() == vehicle.getCapacity() && Double.compare(vehicle.getFuelUsage(), getFuelUsage())
                == 0 && getBrand() == vehicle.getBrand();
    }
}

