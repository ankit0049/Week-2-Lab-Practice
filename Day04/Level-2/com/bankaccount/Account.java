package com.bankaccount;

// Represents a Bank Account linked to a Customer and a Bank
class Account {
    // Unique account number
    String accountNumber;
    // Account balance
    double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display the account balance
    public void viewBalance() {
        System.out.println("Account " + accountNumber + " has a balance of $" + balance);
    }
}