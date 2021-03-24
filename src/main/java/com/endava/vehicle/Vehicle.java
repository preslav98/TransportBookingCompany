package com.endava.vehicle;

import com.endava.enums.Brand;




public abstract class Vehicle {
    private Brand brand ;
    private int capacity;
    private double fuelUsage;

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


    public int getCapacity() {
        return capacity;
    }

    public double getFuelUsage() { return fuelUsage; }

//
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Vehicle)) return false;
//        Vehicle vehicle = (Vehicle) o;
//        return getCapacity() == vehicle.getCapacity() && Double.compare(vehicle.getFuelUsage(), getFuelUsage())
//                == 0 && getBrand() == vehicle.getBrand();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getBrand(), getCapacity(), getFuelUsage());
//    }

    @Override
    public String toString() {
        return "The vehicle is a " + getBrand() +
                " with capacity of " + getCapacity();
    }
}
