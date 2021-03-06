package com.endava.vehicle.bus;

import com.endava.vehicle.Vehicle;


public class Bus extends Vehicle {


    @Override
    public String toString() {
        return "The bus is a " + super.getBrand() +
                " with capacity of " + super.getCapacity();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Vehicle vehicle = (Bus) o;
        return getCapacity() == vehicle.getCapacity() && Double.compare(vehicle.getFuelUsage(), getFuelUsage())
                == 0 && getBrand() == vehicle.getBrand();
    }
}
