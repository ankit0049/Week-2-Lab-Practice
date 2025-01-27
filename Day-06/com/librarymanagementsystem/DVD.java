package com.librarymanagementsystem;

// Class representing a DVD, which is a type of library item
// It extends the LibraryItem class and implements the Reservable interface
class DVD extends LibraryItem implements Reservable {

	// Static constant to represent the loan duration for DVDs
	private final int LOAN_DURATION;

	// Constructor to initialize DVD details
	public DVD(String itemId, String title, String author , int LOAN_DURATION) {
		// Call the parent class constructor to initialize the common library item details
		super(itemId, title, author);

		// set the value of the LOAN DURATION
		this.LOAN_DURATION = LOAN_DURATION;
	}

	// Override the abstract method to provide the loan duration for a DVD
	@Override
	public int getLoanDuration() {
		return LOAN_DURATION;
	}

	// Override the method to reserve the DVD
	@Override
	public void reserveItem() {
		// Print a message indicating that the DVD has been reserved
		System.out.println("DVD reserved: " + getTitle());
	}

	// Override the method to check availability of the DVD
	@Override
	public boolean checkAvailability() {
		// Return true if the DVD is available for reservation (simplified)
		return true;
	}
}
