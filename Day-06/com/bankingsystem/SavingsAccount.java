package com.bankingsystem;

// Class representing a savings account, extending BankAccount and implementing Loanable
class SavingsAccount extends BankAccount implements Loanable {

	// Field to store the interest rate for the savings account
	private final double INTEREST_RATE;

	// Constructor to initialize savings account details
	public SavingsAccount(String accountNumber, String holderName, double balance , double INTEREST_RATE) {
		// Call the parent constructor to initialize account details
		super(accountNumber, holderName, balance);

		// setting the value of the Instance variable named as INTEREST_RATE;
		this.INTEREST_RATE = INTEREST_RATE ;
	}

	// Implement the method to calculate interest for savings accounts
	@Override
	public double calculateInterest() {
		// Calculate interest as balance multiplied by the interest rate
		return getBalance() * INTEREST_RATE;
	}

	// Implement the method to apply for a loan in a savings account
	@Override
	public void applyForLoan(double amount) {
		// Print loan application confirmation
		System.out.println("Loan application submitted for $" + amount + " from Savings Account.");
	}

	// Implement the method to calculate loan eligibility for a savings account
	@Override
	public double calculateLoanEligibility() {
		// Loan eligibility is 50% of the current balance
		return getBalance() * 0.5;
	}
}
