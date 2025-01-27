package com.vehiclerentalsystem;

// Class representing a Truck, which is a type of vehicle
// It extends the Vehicle class and implements the Insurable interface
class Truck extends Vehicle implements Insurable {

	// Static constant to store the insurance rate for trucks
	private final double INSURANCE_RATE;

	// Constructor to initialize the truck details
	public Truck(String vehicleNumber, double rentalRate, double INSURANCE_RATE) {
		// Call the parent class constructor with the vehicle number, type, and rental rate
		super(vehicleNumber, "Truck", rentalRate);

		// set the inastcne variable
		this.INSURANCE_RATE = INSURANCE_RATE;
	}

	// Override the method to calculate the rental cost for a truck
	@Override
	public double calculateRentalCost(int days) {
		// Calculate the rental cost by multiplying the rental rate with the number of days
		return getRentalRate() * days;
	}

	// Override the method to calculate the insurance cost for a truck
	@Override
	public double calculateInsurance() {
		// Calculate the insurance cost as a percentage of the rental rate
		return getRentalRate() * INSURANCE_RATE;
	}

	// Override the method to provide the insurance details for the truck
	@Override
	public String getInsuranceDetails() {
		// Return the insurance rate for the truck
		return "Insurance Rate: " + (INSURANCE_RATE * 100) + "%";
	}
}
