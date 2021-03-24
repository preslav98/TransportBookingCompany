package com.endava.app;

import com.endava.company.Bookings;
import com.endava.vehicle.Vehicle;
import com.endava.vehicle.VehiclePOJOFactory;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleMenu {
    private static final Bookings booking = new Bookings();

    private static void setBookingVehicle() throws IOException {
        Vehicle bus = VehiclePOJOFactory.createBus("src/main/resources/vehicles.json");
        booking.setVehicle(bus);
    }

    public static void displayMenu() {
        Scanner choose = new Scanner(System.in);
        int choice;
        System.out.println("\nTo buy a ticket - type 1.\nTo view information about the vehicle - type 2.\n" +
                "To exit the program - type 3.");
        try {
            choice = choose.nextInt();
            switch (choice) {
                case 1:
                    ConsoleMenu.option1();
                    break;
                case 2:
                    setBookingVehicle();
                    System.out.println(booking.getVehicle());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 3.");
            }
        } catch (InputMismatchException | IOException e) {
            System.out.println("Please enter valid input.");
            displayMenu();

        }
    }


    public static void option1() throws IOException {
        setBookingVehicle();
        Scanner choose = new Scanner(System.in);
        System.out.println("Enter start point");
        String startP = choose.next();
        booking.setStartPoint(startP);
        System.out.println("Enter end point");
        String endP = choose.next();
        booking.setEndPoint(endP);
        booking.setDistance();
        booking.calcPrice();
        System.out.println("You successfully booked a ticket. Booking info:");
        System.out.println(booking + "\n");

    }
}
