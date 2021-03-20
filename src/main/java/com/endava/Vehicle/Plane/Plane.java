package com.endava.Vehicle.Plane;

import com.endava.Vehicle.Vehicle;
import com.endava.enums.Brand;

public class Plane extends Vehicle {


    @Override
    public String toString() {
        return "The plane is a " + super.getBrand() +
                " with capacity of " + super.getCapacity();
    }
}

