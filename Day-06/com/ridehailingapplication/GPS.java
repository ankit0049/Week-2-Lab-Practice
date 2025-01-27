package com.ridehailingapplication;

// Interface defining methods related to GPS functionality for vehicles
interface GPS {

	// Method to get the current location of the vehicle
	String getCurrentLocation();

	// Method to update the location of the vehicle
	void updateLocation(String newLocation);
}
