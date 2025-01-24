package com.multilevel.order_management;

// Subclass representing a shipped order
class ShippedOrder extends Order
{
    // Attribute: Tracking number for the shipped order
    protected String trackingNumber;

    // Constructor to initialize shipped order attributes
    public ShippedOrder(String orderId, String orderDate, String trackingNumber)
    {   // Call the constructor of the base class
        super(orderId, orderDate);
        // set the instance variable value
        this.trackingNumber = trackingNumber;
    }

    // Overridden method to return the status of the order
    @Override
    public String getOrderStatus()
    {   // returning the tracking number of the order
        return "Order shipped. Tracking Number: " + trackingNumber;
    }
}