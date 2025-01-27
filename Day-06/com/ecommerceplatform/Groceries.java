package com.ecommerceplatform;

// Class to represent a groceries product
// Inherits from the Product abstract class
class Groceries extends Product {

	// Constructor to initialize grocery product details
	public Groceries(int productId, String name, double price) {
		// Call the parent class constructor with the provided arguments
		super(productId, name, price);
	}

	// Override the method to calculate the discount for groceries
	@Override
	public double calculateDiscount() {
		// Calculate a 6% discount on the price of the groceries product
		return getPrice() * 0.06;
	}
}