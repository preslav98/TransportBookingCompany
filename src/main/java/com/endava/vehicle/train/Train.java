package com.endava.vehicle.train;

import com.endava.vehicle.Vehicle;

import java.util.Objects;

public class Train extends Vehicle {


    @Override
    public String toString() {
        return "The train is a " + super.getBrand() +
                " with capacity of " + super.getCapacity();
    }

    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Vehicle vehicle = (Train) o;
        return getCapacity() == vehicle.getCapacity() && Double.compare(vehicle.getFuelUsage(), getFuelUsage())
                == 0 && getBrand() == vehicle.getBrand();
    }

    @Override
    public final int hashCode() {
        return Objects.hash(super.getBrand(), super.getCapacity(), super.getFuelUsage());
    }

}

