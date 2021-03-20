package com.endava;

import com.endava.Vehicle.Bus.Bus;
import com.endava.Vehicle.Car.Car;
import com.endava.Vehicle.Plane.Plane;
import com.endava.Vehicle.Vehicle;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class VehiclePOJOFactory {

    public static Vehicle createBus(String thePathName) {
        ObjectMapper objectMapper = new ObjectMapper();
        Vehicle bus = new Bus();

        try {
            bus = objectMapper.readValue(new File(thePathName), Bus.class);
        } catch (Exception e) {
            System.err.println("File missing.");

        }
        return bus;
    }

    public static Vehicle createCar(String thePathName) {
        ObjectMapper objectMapper = new ObjectMapper();
        Vehicle car = new Car();

        try {
            car = objectMapper.readValue(new File(thePathName), Bus.class);
        } catch (Exception e) {
            System.err.println("File missing.");

        }
        return car;
    }

    public static Vehicle createPlane(String thePathName) {

        ObjectMapper objectMapper = new ObjectMapper();
        Vehicle plane = new Plane();

        try {
            plane = objectMapper.readValue(new File(thePathName), Bus.class);
        } catch (Exception e) {
            System.err.println("File missing.");

        }
        return plane;
    }
}
