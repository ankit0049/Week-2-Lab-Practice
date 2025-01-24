package com.ecommerceretailstore;

import java.util.ArrayList;

// Class representing a Customer
public class Customer {
    // Private attribute to store the customer's name
    private String customerName;

    // Private list to store orders placed by the customer (Aggregation)
    private ArrayList<Order> orders;

    // Constructor to initialize a Customer name
    public Customer(String customerName) {
        // Assigning the provided customer name to the attribute
        this.customerName = customerName;

        // Initializing the list that will store orders
        this.orders = new ArrayList<>();
    }

    // Method for the customer to place an order
    public void placeOrder(Order order) {
        // Adding the order object to the orders list
        orders.add(order);
    }

    // Method to display the customer's orders
    public void showOrders() {
        // Printing the customer's name before listing orders
        System.out.println(customerName + " has placed the following orders:");

        // Looping through the orders list
        for (Order order : orders) {
            // Displaying the details of each order
            order.showOrderDetails();
        }
    }
}