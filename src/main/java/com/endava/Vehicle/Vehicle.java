package com.endava.Vehicle;

import com.endava.enums.Brand;

public abstract class Vehicle {
    private Brand brand;
    private int capacity;
    private double fuelUsage; // The fuel usage is calculated as fuel/100km

    public Vehicle() {
    }

    public Vehicle(Brand brand, int capacity, double fuelUsage) {
        this.brand = brand;
        this.capacity = capacity;
        this.fuelUsage = fuelUsage;
    }



    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }
}
