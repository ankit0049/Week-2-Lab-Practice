package com.onlinefooddeliverysystem;

// Abstract class to represent a general food item
abstract class FoodItem {

	// Field to store the name of the food item
	private String itemName;

	// Field to store the price of the food item
	private double price;

	// Field to store the quantity of the food item
	private int quantity;

	// Constructor to initialize food item details
	public FoodItem(String itemName, double price, int quantity) {
		// Assign the item name to the instance variable
		this.itemName = itemName;

		// Assign the price to the instance variable
		this.price = price;

		// Assign the quantity to the instance variable
		this.quantity = quantity;
	}

	// Getter method to retrieve the name of the food item
	public String getItemName() {
		return itemName;
	}

	// Getter method to retrieve the price of the food item
	public double getPrice() {
		return price;
	}

	// Getter method to retrieve the quantity of the food item
	public int getQuantity() {
		return quantity;
	}

	// Abstract method to calculate the total price of the food item (implemented by subclasses)
	public abstract double calculateTotalPrice();

	// Method to display food item details
	public void getItemDetails() {
		// Print the food item details: name, price, and quantity
		System.out.println("Item Name: " + itemName);
		System.out.println("Price: $" + price);
		System.out.println("Quantity: " + quantity);
	}
}
