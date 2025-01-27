package com.librarymanagementsystem;

// Class representing a Magazine, which is a type of library item
// It extends the LibraryItem class and implements the Reservable interface
class Magazine extends LibraryItem implements Reservable {

	// Static constant to represent the loan duration for magazines
	private final int LOAN_DURATION;

	// Constructor to initialize magazine details
	public Magazine(String itemId, String title, String author, int LOAN_DURATION) {
		// Call the parent class constructor to initialize the common library item details
		super(itemId, title, author);

		// setting the value of the instance variable
		this.LOAN_DURATION = LOAN_DURATION;
	}

	// Override the abstract method to provide the loan duration for a magazine
	@Override
	public int getLoanDuration() {
		return LOAN_DURATION;
	}

	// Override the method to reserve the magazine
	@Override
	public void reserveItem() {
		// Print a message indicating that the magazine has been reserved
		System.out.println("Magazine reserved: " + getTitle());
	}

	// Override the method to check availability of the magazine
	@Override
	public boolean checkAvailability() {
		// Return true if the magazine is available for reservation (simplified)
		return true;
	}
}
