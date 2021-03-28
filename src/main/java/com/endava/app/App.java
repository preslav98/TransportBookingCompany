package com.endava.app;


import com.endava.parking.AirportParking;
import com.endava.parking.AirportParkingManagement;
import com.endava.vehicle.Vehicle;
import com.endava.vehicle.VehiclePOJOFactory;

import java.io.IOException;

public class App {


    public static void main(String[] args) throws InterruptedException, IOException {
        //ConsoleMenu.displayMenu();
        AirportParking parking = new AirportParking();
        AirportParkingManagement management = new AirportParkingManagement(parking);
        Vehicle bus = VehiclePOJOFactory.createBus("src/main/resources/vehicles.json");
        management.checkIn(bus, "Ivan");
        Thread.sleep(10000);
        System.out.println(management.createBilling(bus));
    }
}

