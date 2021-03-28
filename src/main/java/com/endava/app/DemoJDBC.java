package com.endava.app;



import com.endava.crud.VehicleCrud;
import com.endava.util.ConnectionFactory;
import com.endava.vehicle.Vehicle;
import com.endava.vehicle.VehiclePOJOFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DemoJDBC {
    public static void main(String[] args) throws InterruptedException, IOException {
        Vehicle vehicle = VehiclePOJOFactory.createBus("src/main/resources/vehicles.json");
        System.out.println(vehicle.toString());
        VehicleCrud.insertVehicle(vehicle);


    }
}
