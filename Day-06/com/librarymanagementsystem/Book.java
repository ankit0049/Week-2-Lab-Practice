package com.librarymanagementsystem;

// Class representing a Book, which is a type of library item
// It extends the LibraryItem class and implements the Reservable interface
class Book extends LibraryItem implements Reservable {

	// Static constant to represent the loan duration for books
	private final int LOAN_DURATION;

	// Constructor to initialize book details
	public Book(String itemId, String title, String author , int LOAN_DURATION) {
		// Call the parent class constructor to initialize the common library item details
		super(itemId, title, author);

		// setting the value of the LOAN DURATION
		this.LOAN_DURATION = LOAN_DURATION;
	}

	// Override the abstract method to provide the loan duration for a book
	@Override
	public int getLoanDuration() {
		return LOAN_DURATION;
	}

	// Override the method to reserve the book
	@Override
	public void reserveItem() {
		// Print a message indicating that the book has been reserved
		System.out.println("Book reserved: " + getTitle());
	}

	// Override the method to check availability of the book
	@Override
	public boolean checkAvailability() {
		// Return true if the book is available for reservation (simplified)
		return true;
	}
}