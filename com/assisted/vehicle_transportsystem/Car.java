package com.assisted.vehicle_transportsystem;

class Car extends Vehicle
{
    // Declaring the seat capacity of the car
    private int seatCapacity;

    // Constructor to initialize Car object
    public Car(int maxSpeed, String fuelType, int seatCapacity)
    {
        // Calling the superclass constructor to set maxSpeed and fuelType
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo method to include Car-specific details
    @Override
    public void displayInfo()
    {
        // Calling the superclass method to display common vehicle details
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}