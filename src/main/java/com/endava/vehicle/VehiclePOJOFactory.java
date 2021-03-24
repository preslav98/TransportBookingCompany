package com.endava.vehicle;

import com.endava.vehicle.Vehicle;
import com.endava.vehicle.bus.Bus;
import com.endava.vehicle.car.Car;
import com.endava.vehicle.plane.Plane;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class VehiclePOJOFactory {

    public static Vehicle createBus(String thePathName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Vehicle bus = objectMapper.readValue(new File(thePathName), Bus.class);
       return bus;
    }

    public static Vehicle createCar(String thePathName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Vehicle car = objectMapper.readValue(new File(thePathName), Car.class);
        return car;
    }


    public static Vehicle createPlane(String thePathName) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Vehicle plane = objectMapper.readValue(new File(thePathName), Plane.class);
        return plane;
    }
}
