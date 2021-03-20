package com.endava.Vehicle.Bus;

import com.endava.Vehicle.Vehicle;
import com.endava.enums.Brand;

public class Bus extends Vehicle {
    private Brand brand;
    private int capacity;
    private double fuelUsage; // The fuel usage is calculated as fuel/100km

    public Bus() {
    }

    public Bus(Brand brand, int capacity, double fuelUsage) {
        super(brand, capacity, fuelUsage);
    }


    @Override
    public Brand getBrand() {
        return brand;
    }

    @Override
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double getFuelUsage() {
        return fuelUsage;
    }

    @Override
    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    @Override
    public String toString() {
        return "The bus is a " + brand +
                " with capacity of " + capacity;
    }
}
