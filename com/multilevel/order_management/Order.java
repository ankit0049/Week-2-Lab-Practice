package com.multilevel.order_management;

// Base class representing a general order
class Order
{
    // Attribute Unique identifier for the order
    protected String orderId;

    // Attribute Date when the order was placed
    protected String orderDate;

    // Constructor to initialize order attributes
    public Order(String orderId, String orderDate)
    {   // set the instance variable from the parameter
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display order details
    public void displayOrderDetails()
    {   // displaying the order details
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

    // Method to return the status of the order
    public String getOrderStatus()
    {   // returning the order status
        return "Order placed.";
    }
}
