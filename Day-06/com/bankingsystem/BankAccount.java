package com.bankingsystem;
// Abstract class representing a general bank account
abstract class BankAccount {

	// Field to store the account number
	private String accountNumber;

	// Field to store the account holder's name
	private String holderName;

	// Field to store the account balance
	private double balance;

	// Constructor to initialize bank account details
	public BankAccount(String accountNumber, String holderName, double balance) {
		// Assign account number to the instance variable
		this.accountNumber = accountNumber;

		// Assign holder's name to the instance variable
		this.holderName = holderName;

		// Assign balance to the instance variable
		this.balance = balance;
	}

	// Getter method to retrieve the account number
	public String getAccountNumber() {
		return accountNumber;
	}

	// Getter method to retrieve the account holder's name
	public String getHolderName() {
		return holderName;
	}

	// Getter method to retrieve the balance
	public double getBalance() {
		return balance;
	}

	// Method to deposit money into the account
	public void deposit(double amount) {
		// Check if the deposit amount is positive
		if (amount > 0) {
			// Increase the balance by the deposit amount
			balance += amount;
			// Print confirmation message
			System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
		} else {
			// Print an error message if the deposit amount is invalid
			System.out.println("Deposit amount must be greater than zero.");
		}
	}

	// Method to withdraw money from the account
	public void withdraw(double amount) {
		// Check if the withdrawal amount is valid and within the balance
		if (amount > 0 && amount <= balance) {
			// Decrease the balance by the withdrawal amount
			balance -= amount;
			// Print confirmation message
			System.out.println("Withdrawn $" + amount + ". New Balance: $" + balance);
		} else {
			// Print an error message if the withdrawal amount is invalid
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Abstract method to calculate interest, to be implemented by subclasses
	public abstract double calculateInterest();
}