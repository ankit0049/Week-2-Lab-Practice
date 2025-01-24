package com.ecommerceretailstore;

// Class representing a Product
public class Product {
    // Private attribute to store the product name
    private String productName;

    // Private attribute to store the product price
    private double price;

    // Constructor to initialize a Product's name and price
    public Product(String productName, double price) {
        // Assigning the provided product name to the attribute
        this.productName = productName;

        // Assigning the provided price to the attribute
        this.price = price;
    }

    // Method to retrieve the product's name
    public String getProductName() {
        // Returning the name of the product
        return productName;
    }

    // Method to retrieve the product's price
    public double getPrice() {
        // Returning the price of the product
        return price;
    }
}