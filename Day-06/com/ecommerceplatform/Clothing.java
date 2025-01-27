package com.ecommerceplatform;

// Class to represent a clothing product
// Inherits from the Product abstract class and implements the Taxable interface
class Clothing extends Product implements Taxable {

	// Static field to store the tax rate for clothing products
	private final double TAX_RATE;

	// Constructor to initialize clothing product details
	public Clothing(int productId, String name, double price , double TAX_RATE) {
		// Call the parent class constructor with the provided arguments
		super(productId, name, price);

		// Assigning the user Input tax rate (Finance Minister smt. Nirmala Sitaraman ji)
		this.TAX_RATE = TAX_RATE;
	}

	// Override the method to calculate the discount for clothing
	@Override
	public double calculateDiscount() {
		// Calculate a 20% discount on the price of the clothing product
		return getPrice() * 0.20;
	}

	// Override the method to calculate the tax for clothing
	@Override
	public double calculateTax() {
		// Calculate tax based on the price and tax rate
		return getPrice() * TAX_RATE;
	}

	// Override the method to provide details about the tax
	@Override
	public String getTaxDetails() {
		// Return the tax rate in percentage format
		return "Tax Rate: " + (TAX_RATE * 100) + "%";
	}
}