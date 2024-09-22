package org.apache.housingapp;

import java.util.List;

public class Housing {
    private String address;
    private double price;
    private String location;
    private List<String> proximityServices;
    private boolean available;

    // Constructors, Getters, Setters
    public Housing(String address, double price, String location, List<String> proximityServices, boolean available) {
        this.address = address;
        this.price = price;
        this.location = location;
        this.proximityServices = proximityServices;
        this.available = available;
    }

    public String getAddress() {
        return this.address;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLocation() {
        return this.location;
    }

    public List<String> getProximityServices() {
        return this.proximityServices;
    }

    public boolean isAvailable() {
        return this.available;
    }
}
