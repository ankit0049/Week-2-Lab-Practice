package com.hybrid.vehicle_management_system;

// Subclass representing an electric vehicle
class ElectricVehicle extends Vehicle {

    // Battery capacity of the electric vehicle
    private int batteryCapacity;

    // Constructor to initialize electric vehicle details
    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        // Calling parent constructor to initialize common attributes
        super(maxSpeed, model);
        // Assigning battery capacity
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        // Printing charging status of the vehicle
        System.out.println(model + " is charging. Battery Capacity: " + batteryCapacity + " kWh.");
    }

    // Overriding method to display vehicle details
    public void displayVehicleDetails() {
        // Calling parent method to print common details
        super.displayVehicleDetails();
        // Printing battery capacity of the electric vehicle
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
