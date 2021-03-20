package com.endava.Vehicle.Plane;

import com.endava.Vehicle.Vehicle;
import com.endava.enums.Brand;

public class Plane extends Vehicle {
    private Brand brand;
    private int capacity;
    private double fuelUsage; // The fuel usage is calculated as fuel/100km
    private boolean hasFirstClass;

    public Plane() {
    }

    public Plane(Brand brand, int capacity, double fuelUsage, boolean hasFirstClass) {
        super(brand, capacity, fuelUsage);
        this.hasFirstClass = hasFirstClass;
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

    public boolean isHasFirstClass() {
        return hasFirstClass;
    }

    public void setHasFirstClass(boolean hasFirstClass) {
        this.hasFirstClass = hasFirstClass;
    }

    @Override
    public String toString() {
        return "The plane is a " + brand +
                " with capacity of " + capacity;
    }
}

