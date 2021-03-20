package com.endava.Vehicle.Bus;

import com.endava.Vehicle.Vehicle;


public class Bus extends Vehicle {


    @Override
    public String toString() {
        return "The bus is a " + super.getBrand() +
                " with capacity of " + super.getCapacity();
    }
}
