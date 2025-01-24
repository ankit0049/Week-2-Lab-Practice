package com.hybrid.vehicle_management_system;


// Subclass representing a petrol vehicle that implements Refuelable interface
class PetrolVehicle extends Vehicle implements Refuelable {

    // Fuel tank capacity of the petrol vehicle
    private int fuelCapacity;

    // Constructor to initialize petrol vehicle details
    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        // Calling parent constructor to initialize common attributes
        super(maxSpeed, model);
        // Assigning fuel tank capacity
        this.fuelCapacity = fuelCapacity;
    }

    // Overriding method to implement refueling functionality
    @Override
    public void refuel() {
        // Printing refueling status of the vehicle
        System.out.println(model + " is refueling. Fuel Capacity: " + fuelCapacity + " liters.");
    }

    // Overriding method to display vehicle details
    public void displayVehicleDetails() {
        // Calling parent method to print common details
        super.displayVehicleDetails();
        // Printing fuel tank capacity of the petrol vehicle
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
