package com.assisted.vehicle_transportsystem;

class Motorcycle extends Vehicle {
    // Declaring whether the motorcycle has ABS (Anti-lock Braking System)
    private boolean hasABS;

    // Constructor to initialize Motorcycle object
    public Motorcycle(int maxSpeed, String fuelType, boolean hasABS) {
        // Calling the superclass constructor to set maxSpeed and fuelType
        super(maxSpeed, fuelType);
        this.hasABS = hasABS;
    }

    // Overriding displayInfo method to include Motorcycle-specific details
    @Override
    public void displayInfo() {
        // Calling the superclass method to display common vehicle details
        super.displayInfo();
        System.out.println("ABS Available: " + (hasABS ? "Yes" : "No"));
    }
}