package com.endava.crud;

import com.endava.util.ConnectionFactory;
import com.endava.vehicle.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class VehicleCrud {

    public static void insertVehicle(Vehicle vehicle) {
        String sql = "INSERT INTO vehicles (brand, capacity, fuel_usage) VALUES (?, ?, ?)";

        try {
            Connection connection = new ConnectionFactory().createConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, vehicle.getBrand().name());
            statement.setInt(2, vehicle.getCapacity());
            statement.setDouble(3, vehicle.getFuelUsage());
            statement.executeUpdate();
            connection.close();
        } catch (java.sql.SQLException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
