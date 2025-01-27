package com.ecommerceplatform;

public class EcommercePlateformControlar{
	// Main method to execute the program
	public static void main(String[] args){

		// Create an Electronics object with specific details
		Electronics mobile = new Electronics(24, "Mobile", 8000.0 , 0.18);

		// Create a Clothing object with specific details
		Clothing upper = new Clothing(102, "upper", 40.0, 0.25);

		// Create a Groceries object with specific details
		Groceries apple = new Groceries(103, "Apple", 2.0);

		// Display the details and final price for the electronics product
		System.out.println("Electronics Details:");
		mobile.displayDetails();
		System.out.println("Discount: $" + mobile.calculateDiscount());
		System.out.println("Tax with percentage and cost$" + "Percentage :"+ mobile.getTaxDetails()+", Cost :"+ mobile.calculateTax());
		System.out.println("Final Price: $" + (mobile.getPrice() + mobile.calculateTax() - mobile.calculateDiscount()));

		// Display the details and final price for the clothing product
		System.out.println("\nClothing Details:");
		upper.displayDetails();
		System.out.println("Discount: $" + upper.calculateDiscount());
		System.out.println("Tax Percentage is: "+ upper.getTaxDetails() +" and Tax cost is $" + upper.calculateTax());
		System.out.println("Final Price: $" + (upper.getPrice() + upper.calculateTax() - upper.calculateDiscount()));

		// Display the details and final price for the groceries product
		System.out.println("\nGroceries Details:");
		apple.displayDetails();
		System.out.println("Discount: $" + apple.calculateDiscount());
		System.out.println("Final Price: $" + (apple.getPrice() - apple.calculateDiscount()));
	}
}
