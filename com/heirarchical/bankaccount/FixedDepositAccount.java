package com.heirarchical.bankaccount;

// Subclass representing a fixed deposit account
class FixedDepositAccount extends BankAccount
{

    // Maturity period in months for the fixed deposit
    private int maturityPeriod;

    // Constructor to initialize fixed deposit details
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod)
    {
        // Calling parent constructor to initialize common attributes
        super(accountNumber, balance);
        // Assigning maturity period
        this.maturityPeriod = maturityPeriod;
    }

    // Overriding method to specify account type
    @Override
    public String getAccountType()
    {
        // Returning fixed deposit account type
        return "Fixed Deposit Account";
    }

    public void displayAccountDetails()
    {
        // Printing account number
        System.out.println("Account Number: " + accountNumber);

        // Printing current balance
        System.out.println("Balance: $" + balance);

        // Printing account type
        System.out.println("Type: " + getAccountType());

        // Printing the maturityPeriod
        System.out.println("Maturity Period: "+ maturityPeriod);

        // Printing the space to give clear output look
        System.out.println();
    }
}