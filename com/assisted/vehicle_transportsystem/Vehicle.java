package com.assisted.vehicle_transportsystem;

// Defining the superclass Vehicle
class Vehicle {
    // Declaring the maximum speed of the vehicle
    protected int maxSpeed;

    // Declaring the type of fuel used by the vehicle
    protected String fuelType;

    // Constructor to initialize Vehicle object
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    public void displayInfo()
    {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}