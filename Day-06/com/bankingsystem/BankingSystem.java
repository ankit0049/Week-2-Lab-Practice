package com.bankingsystem;
// Main class to test the banking system
public class BankingSystem {

	// Main method to execute the program
	public static void main(String[] args) {

		// Create a savings account with details: account number, holder's name, and initial balance
		SavingsAccount savingsAccount = new SavingsAccount("KL2345", "Mathur Anshul", 589000.0,0.18);

		// Create a current account with details: account number, holder's name, and initial balance
		CurrentAccount currentAccount = new CurrentAccount("6CA7890", "Kumar Ankit", 178000.0, 0.11);

		// Display details of the savings account
		System.out.println("Savings Account Details:");
		System.out.println("Account Number: " + savingsAccount.getAccountNumber());
		System.out.println("Holder Name: " + savingsAccount.getHolderName());
		System.out.println("Balance: $" + savingsAccount.getBalance());
		System.out.println("Calculated Interest: $" + savingsAccount.calculateInterest());

		// Deposit money into the savings account
		savingsAccount.deposit(2000);

		// Withdraw money from the savings account
		savingsAccount.withdraw(1000);

		// Display loan eligibility for the savings account
		System.out.println("Loan Eligibility: $" + savingsAccount.calculateLoanEligibility());

		// Apply for a loan in the savings account
		savingsAccount.applyForLoan(1500);

		// Display details of the current account
		System.out.println("\nCurrent Account Details:");
		System.out.println("Account Number: " + currentAccount.getAccountNumber());
		System.out.println("Holder Name: " + currentAccount.getHolderName());
		System.out.println("Balance: $" + currentAccount.getBalance());
		System.out.println("Calculated Interest: $" + currentAccount.calculateInterest());

		// Deposit money into the current account
		currentAccount.deposit(5000);

		// Withdraw money from the current account
		currentAccount.withdraw(3000);

		// Display loan eligibility for the current account
		System.out.println("Loan Eligibility: $" + currentAccount.calculateLoanEligibility());

		// Apply for a loan in the current account
		currentAccount.applyForLoan(5000);
	}
}