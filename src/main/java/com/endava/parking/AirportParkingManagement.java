package com.endava.parking;

import com.endava.vehicle.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AirportParkingManagement {
    private AirportParking parking = new AirportParking();
    private Map<Vehicle, Long> vehicleCheckInHour = new HashMap<>();
    private final static double PRICE_FOR_HOUR = 20;


    public AirportParkingManagement(AirportParking parking) {
        this.parking = parking;
    }

    public AirportParking getParking() {
        return parking;
    }

    public void setParking(AirportParking parking) {
        this.parking = parking;
    }

    public void checkIn(Vehicle vehicle, String owner) {
        parking.addVehicle(vehicle, owner);
        vehicleCheckInHour.put(vehicle, System.currentTimeMillis());
    }

    private long uncheck(Vehicle vehicle) {
        long hours = 0;
        try {
            parking.removeVehicle(vehicle);
            hours = vehicleCheckInHour.get(vehicle);
            vehicleCheckInHour.remove(vehicle);
        } catch (NullPointerException ex) {
            System.err.println("Parking is empty");
        }
        return System.currentTimeMillis() - hours;
    }

    public String createBilling(Vehicle vehicle) {
        long timeParkedInMillis = this.uncheck(vehicle);
        if (TimeUnit.MILLISECONDS.toHours(timeParkedInMillis) <= 1) {
            return vehicle.toString() + " and was parked for an hour or less and owes: " + PRICE_FOR_HOUR + "lv.";
        } else {
            return vehicle.toString() + " and was parked for"
                    + TimeUnit.MILLISECONDS.toHours(timeParkedInMillis) + " and owes: "
                    + TimeUnit.MILLISECONDS.toHours(timeParkedInMillis) * PRICE_FOR_HOUR + "lv.";
        }
    }
}
