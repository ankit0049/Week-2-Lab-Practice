package com.bankaccount;
import java.util.ArrayList;

// Represents a Customer who can have multiple accounts
class Customer {
    // Customer name
    String name;
    // List of accounts the customer holds
    ArrayList<Account> accounts;

    // Constructor to initialize customer details
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add a new account for the customer
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println(name + " opened a new account: " + account.accountNumber);
    }

    // Display all accounts and their balances
    public void viewAccounts() {
        System.out.println(name + "'s Accounts:");
        for (Account account : accounts) {
            account.viewBalance();
        }
    }
}