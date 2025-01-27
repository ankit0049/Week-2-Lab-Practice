package com.ecommerceplatform;
// Interface to define tax-related behavior for products
interface Taxable {

	// Method to calculate the tax for the product
	double calculateTax();

	// Method to provide details about the tax
	String getTaxDetails();
}
