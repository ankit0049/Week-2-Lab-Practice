package com.vehiclerentalsystem;

// Interface to define insurable behavior for vehicles
interface Insurable {

	// Method to calculate the insurance cost for the vehicle
	double calculateInsurance();

	// Method to retrieve insurance details
	String getInsuranceDetails();
}
