package com.assisted.vehicle_transportsystem;

// Main class to demonstrate polymorphism using Vehicle hierarchy
public class VehicleControlar
{
    public static void main(String[] args)
    {
        // Creating an array of Vehicle type to store different vehicle objects
        Vehicle[] vehicles = new Vehicle[3];

        // Storing objects of different subclasses in the Vehicle array
        vehicles[0] = new Car(200, "CNG", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(180, "Petrol", true);

        // Iterating through the Vehicle array to display details dynamically
        for (int i = 0; i < vehicles.length; i++)
        {
            System.out.println("\nVehicle " + (i + 1) + " Details:");
            // Calling overridden method based on object type
            vehicles[i].displayInfo();
        }
    }
}