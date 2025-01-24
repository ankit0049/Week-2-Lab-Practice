package com.assisted.vehicle_transportsystem;

// Defining the Truck subclass extending Vehicle
class Truck extends Vehicle
{
    // Declaring the maximum load capacity of the truck
    private int loadCapacity;

    // Constructor to initialize Truck object
    public Truck(int maxSpeed, String fuelType, int loadCapacity){
        // Calling the superclass constructor to set maxSpeed and fuelType
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo method to include Truck-specific details
    @Override
    public void displayInfo(){
        // Calling the superclass method to display common vehicle details
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}