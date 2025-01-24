package com.heirarchical.bankaccount;
// Base class representing a generic bank account
class BankAccount
{

    // Account number of the bank account
    protected String accountNumber;

    // Current balance in the account
    protected double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, double balance)
    {
        // Assigning account number
        this.accountNumber = accountNumber;
        // Assigning account balance
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        // Adding amount to the balance
        balance += amount;
    }

    // Method to return account type (to be overridden)
    public String getAccountType()
    {
        // Returning generic account type
        return "Generic Bank Account";
    }

    // Method to display account details
    public void displayAccountDetails()
    {
        // Printing account number
        System.out.println("Account Number: " + accountNumber);
        // Printing current balance
        System.out.println("Balance: $" + balance);
        // Printing account type
        System.out.println("Type: " + getAccountType());

        // Printing the space to give clear output look
        System.out.println();
    }
}