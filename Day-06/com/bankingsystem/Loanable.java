package com.bankingsystem;
// Interface defining methods related to loan eligibility and application
interface Loanable {

	// Method to apply for a loan
	void applyForLoan(double amount);

	// Method to calculate loan eligibility
	double calculateLoanEligibility();
}
