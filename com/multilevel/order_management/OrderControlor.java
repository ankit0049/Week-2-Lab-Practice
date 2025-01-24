package com.multilevel.order_management;

public class OrderControlor
{
    public static void main(String[] args)
    {
        // Create an instance of DeliveredOrder
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD123", "2025-01-10", "TRK456", "2025-01-15");

        // Display all details of the delivered order
        System.out.println("Display the Delivered Order Details");
        deliveredOrder.displayDeliveredOrderDetails();

        // Display the current status of the order
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
    }

}
