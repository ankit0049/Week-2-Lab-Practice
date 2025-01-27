package com.librarymanagementsystem;

// Abstract class to represent a general library item (book, magazine, DVD)
abstract class LibraryItem {

	// Field to store the item ID (unique identifier)
	private String itemId;

	// Field to store the title of the item
	private String title;

	// Field to store the author or creator of the item
	private String author;

	// Constructor to initialize library item details
	public LibraryItem(String itemId, String title, String author) {
		// Assign the item ID to the instance variable
		this.itemId = itemId;

		// Assign the title to the instance variable
		this.title = title;

		// Assign the author to the instance variable
		this.author = author;
	}

	// Getter method to retrieve the item ID
	public String getItemId() {
		return itemId;
	}

	// Getter method to retrieve the title of the item
	public String getTitle() {
		return title;
	}

	// Getter method to retrieve the author of the item
	public String getAuthor() {
		return author;
	}

	// Abstract method to define loan duration for different library items
	// This method will be implemented by subclasses (Book, Magazine, DVD)
	public abstract int getLoanDuration();

	// Method to display the item details
	public void getItemDetails() {
		// Print the item details: ID, title, and author
		System.out.println("Item ID: " + itemId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
}