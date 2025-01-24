package com.ecommerceretailstore;

// E_Commerce class to demonstrate customer-product-order relationships
public class E_Commerce {
    public static void main(String[] args) {
        // Creating Product objects
        Product laptop = new Product("Laptop", 50000.00);
        Product phone = new Product("Smartphone", 10000.00);

        // Creating Customer object
        Customer abhishek = new Customer("Abhishek");

        // Creating Order object
        Order order1 = new Order();

        // Adding products to the order
        order1.addProduct(laptop);
        order1.addProduct(phone);

        // Customer places the order
        abhishek.placeOrder(order1);

        // Displaying the customer's orders
        abhishek.showOrders();
    }
}