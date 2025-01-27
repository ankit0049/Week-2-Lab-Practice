package com.librarymanagementsystem;

// Interface to define reservable behavior for library items
interface Reservable {

	// Method to reserve the item
	void reserveItem();

	// Method to check if the item is available for reservation
	boolean checkAvailability();
}
