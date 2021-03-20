package com.endava;

import com.endava.Company.Bookings;
import com.endava.Vehicle.Bus.Bus;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleMenu {
    private static final Bookings booking = new Bookings();
    private static Bus bus = new Bus();

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
                    readBusInfo();
                    System.out.println(booking.getVehicle());

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Please enter a number between 1 and 3.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid input.");
            displayMenu();

        }
    }


    public static void option1() {
        readBusInfo();
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

    public static void readBusInfo() {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            bus = objectMapper.readValue(new File("src/main/resources/vehicles.json"), Bus.class);

            booking.setVehicle(bus);

        } catch (Exception e) {
            System.out.println("File missing.");

        }

    }
}
