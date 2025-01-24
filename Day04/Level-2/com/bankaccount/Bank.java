package com.bankaccount;

import java.util.ArrayList;

// Represents a Bank that associates with multiple customers
class Bank {
    // Name of the bank
    String bankName;
    // List of customers associated with the bank
    ArrayList<Customer> customers;

    // Constructor to initialize bank details
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to add a customer to the bank
    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            System.out.println("Customer " + customer.name + " added to " + bankName);
        }
    }

    // Method to open a new account for a customer
    public void openAccount(Customer customer, String accountNumber, double initialDeposit) {
        if (customers.contains(customer)) {
            Account newAccount = new Account(accountNumber, initialDeposit);
            customer.addAccount(newAccount);
            System.out.println("Account " + accountNumber + " opened for " + customer.name + " at " + bankName);
        } else {
            System.out.println(customer.name + " is not associated with " + bankName);
        }
    }

    // Display all customers of the bank
    public void showCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.name);
        }
    }
}
