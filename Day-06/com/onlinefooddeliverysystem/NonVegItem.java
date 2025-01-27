package com.onlinefooddeliverysystem;

/* Class representing a NonVegItem, which is a type of food item
It extends the FoodItem class and implements the Discountable interface */
class NonVegItem extends FoodItem implements Discountable {

	// Static constant for discount percentage on non-veg items
	private final double DISCOUNT_PERCENTAGE;

	// Constructor to initialize non-veg item details
	public NonVegItem(String itemName, double price, int quantity , double DISCOUNT_PERCENTAGE) {
		// Call the parent class constructor to initialize common food item details
		super(itemName, price, quantity);

		// set the value of the DISCOUNT PERCENTAGE
		this.DISCOUNT_PERCENTAGE = DISCOUNT_PERCENTAGE;
	}

	// Override the abstract method to calculate the total price for a non-veg item
	@Override
	public double calculateTotalPrice() {
		// Calculate the total price (price * quantity)
		return getPrice() * getQuantity();
	}

	// Override the method to apply discount for non-veg items
	@Override
	public double applyDiscount() {
		// Calculate the discount amount
		double discount = (getPrice() * DISCOUNT_PERCENTAGE) / 100;
		// Return the total discount amount
		return discount;
	}

	// Override the method to return discount details for non-veg items
	@Override
	public String getDiscountDetails() {
		// Return a string describing the discount percentage
		return DISCOUNT_PERCENTAGE + "% off on Non-Veg Items";
	}
}