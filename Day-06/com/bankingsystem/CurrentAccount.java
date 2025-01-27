package com.bankingsystem;


// Class representing a current account, extending BankAccount and implementing Loanable
class CurrentAccount extends BankAccount implements Loanable {

	// Field to store the interest rate for the current account
	private final double INTEREST_RATE ;

	// Constructor to initialize current account details
	public CurrentAccount(String accountNumber, String holderName, double balance , double INTEREST_RATE) {
		// Call the parent constructor to initialize account details
		super(accountNumber, holderName, balance);

		// setting the value of INTEREST_RATE
		this.INTEREST_RATE = INTEREST_RATE;
	}

	// Implement the method to calculate interest for current accounts
	@Override
	public double calculateInterest() {
		// Calculate interest as balance multiplied by the interest rate
		return getBalance() * INTEREST_RATE;
	}

	// Implement the method to apply for a loan in a current account
	@Override
	public void applyForLoan(double amount) {
		// Print loan application confirmation
		System.out.println("Loan application submitted for $" + amount + " from Current Account.");
	}

	// Implement the method to calculate loan eligibility for a current account
	@Override
	public double calculateLoanEligibility() {
		// Loan eligibility is 75% of the current balance
		return getBalance() * 0.75;
	}
}