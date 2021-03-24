package com.endava.vehicle.car;

import com.endava.enums.Brand;
import com.endava.vehicle.Vehicle;

import java.util.Objects;

public class Car extends Vehicle {


    @Override
    public String toString() {
        return "The car is a " + super.getBrand() +
                " with capacity of " + super.getCapacity();
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Vehicle vehicle = (Car) o;
        return getCapacity() == vehicle.getCapacity() && Double.compare(vehicle.getFuelUsage(), getFuelUsage())
                == 0 && getBrand() == vehicle.getBrand();
    }
}
