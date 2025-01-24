package com.hybrid.vehicle_management_system;

// Superclass representing a general vehicle
class Vehicle {

     // Maximum speed of the vehicle
     protected int maxSpeed;

     // Model name of the vehicle
     protected String model;

     // Constructor to initialize vehicle details
     public Vehicle(int maxSpeed, String model) {
          // Assigning maximum speed of the vehicle
          this.maxSpeed = maxSpeed;
          // Assigning model name
          this.model = model;
     }

     // Method to display vehicle details
     public void displayVehicleDetails()
     {
          // Printing model name of the vehicle
          System.out.println("Model: " + model);
          // Printing maximum speed of the vehicle
          System.out.println("Max Speed: " + maxSpeed + " km/h");
     }
}
