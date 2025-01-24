package com.heirarchical.bankaccount;


// Subclass representing a savings account
class SavingsAccount extends BankAccount {

    // Interest rate applicable to the savings account
    private double interestRate;

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, double balance, double interestRate)
    {
        // Calling parent constructor to initialize common attributes
        super(accountNumber, balance);
        // Assigning interest rate
        this.interestRate = interestRate;
    }

    // Overriding method to specify account type
    @Override
    public String getAccountType() {
        // Returning savings account type
        return "Savings Account";
    }

    // Method to calculate and add interest to balance
    public void applyInterest() {
        // Calculating interest and adding to balance
        balance += (balance * interestRate / 100);
    }

    public void displayAccountDetails()
    {
        // Printing account number
        System.out.println("Account Number: " + accountNumber);

        // Printing current balance
        System.out.println("Balance: $" + balance);

        // Printing account type
        System.out.println("Type: " + getAccountType());

        // Printing the Interest rate
        System.out.println("Interest Rate: "+ interestRate);

        // Printing the space to give clear output look
        System.out.println();
    }
}