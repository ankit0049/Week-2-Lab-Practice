package com.multilevel.order_management;

// Subclass representing a delivered order
class DeliveredOrder extends ShippedOrder
{
    // Attribute: Date when the order was delivered
    private String deliveryDate;

    // Constructor to initialize delivered order attributes
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate)
    {
        // Call the constructor of the shipped order class
        super(orderId, orderDate, trackingNumber);

        // setting the instance variable from the parameter
        this.deliveryDate = deliveryDate;
    }

    // Overridden method to return the status of the order
    @Override
    public String getOrderStatus()
    {   // returning the deliverydate
        return "Order delivered on: " + deliveryDate;
    }

    // Method to display all details of the delivered order
    public void displayDeliveredOrderDetails()
    {
        // Call the method from the base class
        displayOrderDetails();

        // displaying the information about the order
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
    }
}