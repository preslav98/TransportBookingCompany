package com.endava.Vehicle.Car;

import com.endava.enums.Brand;
import com.endava.Vehicle.Vehicle;

public class Car extends Vehicle {

    @Override
    public String toString() {
        return "The car is a " + super.getBrand() +
                " with capacity of " + super.getCapacity();

    }
}
