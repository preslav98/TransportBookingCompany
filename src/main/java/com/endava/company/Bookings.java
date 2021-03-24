package com.endava.company;

import com.endava.vehicle.Vehicle;

public class Bookings {
    private Vehicle vehicle;
    private String startPoint;
    private String endPoint;
    private double price;
    private double distance;
    final static double OVER_PRICE = 1;
    final static double TAX_RATE = 0.2;

    public Bookings() {
    }

    public Bookings(Vehicle vehicle, String startPoint, String endPoint) {
        this.vehicle = vehicle;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance() {
        GetDistanceUtil getDistanceUtil = new GetDistanceUtil();
        distance = getDistanceUtil.getDistance(startPoint, endPoint);
    }

    public void calcPrice() {
        double fuelPricePerLiter = 2.25;
        double thePrice = (vehicle.getFuelUsage() * (distance / 100))*fuelPricePerLiter;
        double finalPrice = (thePrice + (thePrice * OVER_PRICE)) / vehicle.getCapacity();
        price = finalPrice + (finalPrice* TAX_RATE);
    }

    @Override
    public String toString() {
        return "Booking info:"
                + vehicle +
                ", Departs from ='" + startPoint + '\'' +
                ", Arriving in ='" + endPoint + '\'' +
                ", price=" + String.format("%.2f", price) +"lv. "+
                ", distance=" + distance+"km.";
    }
}
