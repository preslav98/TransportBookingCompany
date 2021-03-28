package com.endava.parking;

import com.endava.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirportParking {
    private final static int CAPACITY = 100;
    private Map<Vehicle, String> vehicleOwner = new HashMap<>();
    private List<Vehicle> parking = new ArrayList<Vehicle>(100);


    public AirportParking() {
    }

    public AirportParking(HashMap<Vehicle, String> carParking) {
        this.vehicleOwner = carParking;
    }

    public Map<Vehicle, String> getCarParking() {
        return vehicleOwner;
    }

    public void setCarParking(HashMap<Vehicle, String> carParking) {
        this.vehicleOwner = carParking;
    }

    public void addVehicle(Vehicle vehicle, String clientName) {
        vehicleOwner.put(vehicle, clientName);
        parking.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicleOwner.remove(vehicle);
        parking.remove(vehicle);
    }

    public boolean hasSpace() {
        return parking.size() < CAPACITY;
    }
}
