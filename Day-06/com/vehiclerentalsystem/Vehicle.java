package com.vehiclerentalsystem;

// Abstract class to represent the general details of a vehicle
abstract class Vehicle {

	// Field to store the vehicle number (unique identifier)
	private String vehicleNumber;

	// Field to store the type of vehicle (Car, Bike, Truck, etc.)
	private String type;

	// Field to store the rental rate per day
	private double rentalRate;

	// Constructor to initialize vehicle details
	public Vehicle(String vehicleNumber, String type, double rentalRate) {
		// Assign the provided vehicle number to the instance variable
		this.vehicleNumber = vehicleNumber;

		// Assign the provided vehicle type to the instance variable
		this.type = type;

		// Assign the provided rental rate to the instance variable
		this.rentalRate = rentalRate;
	}

	// Getter method to retrieve the vehicle number
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	// Getter method to retrieve the type of the vehicle
	public String getType() {
		return type;
	}

	// Getter method to retrieve the rental rate per day
	public double getRentalRate() {
		return rentalRate;
	}

	// Abstract method to calculate the rental cost for a given number of days
	// This method will be implemented by subclasses (Car, Bike, Truck)
	public abstract double calculateRentalCost(int days);
}
