package com.ecommerceretailstore;

// Importing required Java utility package for using ArrayList
import java.util.ArrayList;

// Class representing an Order
public class Order {
    // Private list to store products in the order (Composition)
    private ArrayList<Product> products;

    // Constructor to initialize an Order object
    public Order() {
        // Initializing the list that will store products
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        // Adding the provided product object to the products list
        products.add(product);
    }

    // Method to display the products in the order
    public void showOrderDetails() {
        // Printing order details
        System.out.println("Order Details:");

        // Looping through the products list
        for (Product product : products) {
            // Printing each product's name and price
            System.out.println("- " + product.getProductName() + " (" + product.getPrice() + ")");
        }
    }
}




