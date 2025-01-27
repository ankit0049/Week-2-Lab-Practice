package com.onlinefooddeliverysystem;

// Interface to define discountable behavior for food items
interface Discountable {

	// Method to apply a discount to the food item
	double applyDiscount();

	// Method to get discount details (percentage or amount)
	String getDiscountDetails();
}
