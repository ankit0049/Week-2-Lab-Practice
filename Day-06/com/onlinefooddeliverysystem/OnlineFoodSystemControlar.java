package com.onlinefooddeliverysystem;

public class OnlineFoodSystemControlar {
	// Main method to execute the program
	public static void main(String[] args) {

		// Create a VegItem object with item name, price, and quantity
		VegItem vegItem = new VegItem("Veg Chilla", 12.99, 2,25);

		// Create a NonVegItem object with item name, price, and quantity
		NonVegItem nonVegItem = new NonVegItem("Chicken Fry",8.49, 3, 64);

		// Display the veg item details and apply discount
		System.out.println("Veg Item Details:");
		vegItem.getItemDetails();
		System.out.println("Discount Percentage cost $" + vegItem.applyDiscount());
		System.out.println("Discount Details: " + vegItem.getDiscountDetails());
		System.out.println("Total Price after Discount: $" + (vegItem.calculateTotalPrice() - vegItem.applyDiscount()));

		// Display the non-veg item details and apply discount
		System.out.println("\nNon-Veg Item Details:");
		nonVegItem.getItemDetails();
		System.out.println("Discount: $" + nonVegItem.applyDiscount());
		System.out.println("Discount Details: " + nonVegItem.getDiscountDetails());
		System.out.println("Total Price after Discount: $" + (nonVegItem.calculateTotalPrice() - nonVegItem.applyDiscount()));
	}
}
