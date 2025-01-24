package com.hybrid.vehicle_management_system;

public class VehicleControlarSystem
{
    public static void main(String[] args)
    {

        // Creating an instance of ElectricVehicle with battery capacity
        ElectricVehicle electricCar = new ElectricVehicle(180, "Tesla Model 3", 75);
        // Displaying electric vehicle details
        electricCar.displayVehicleDetails();
        // Charging the electric vehicle
        electricCar.charge();

        // Printing a blank line for separation
        System.out.println();

        // Creating an instance of PetrolVehicle with fuel capacity
        PetrolVehicle petrolCar = new PetrolVehicle(200, "Ford Mustang", 50);
        // Displaying petrol vehicle details
        petrolCar.displayVehicleDetails();
        // Refueling the petrol vehicle
        petrolCar.refuel();
    }
}
