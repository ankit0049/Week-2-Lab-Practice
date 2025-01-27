package com.librarymanagementsystem;

public class LibraryManagementSystem {
	public static void main(String[] args) {

		// Create a Book object with item ID, title, and author
		Book book = new Book("7801", "Java Programming", "Ankit Rajput",22);

		// Create a Magazine object with item ID, title, and author
	     Magazine magazine = new Magazine("Cook01", "Alco begin Tech", "Rajput The boy",7);

		// Create a DVD object with item ID, title, and author
		DVD dvd = new DVD("Dood1", "Java for Beginners", "Michael Brown",15);

		// Display the book details and reserve the book
		System.out.println("Book Details:");
		book.getItemDetails();
		System.out.println("Loan Duration: " + book.getLoanDuration() + " days");
		book.reserveItem();

		// Display the magazine details and reserve the magazine
		System.out.println("\nMagazine Details:");
		magazine.getItemDetails();
		System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");
		magazine.reserveItem();

		// Display the DVD details and reserve the DVD
		System.out.println("\nDVD Details:");
		dvd.getItemDetails();
		System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");
		dvd.reserveItem();
	}
}
