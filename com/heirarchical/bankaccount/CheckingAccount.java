package com.heirarchical.bankaccount;
// Subclass representing a checking account
class CheckingAccount extends BankAccount
{

    // Withdrawal limit for the checking account
    private double withdrawalLimit;

    // Constructor to initialize checking account details
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit)
    {
        // Calling parent constructor to initialize common attributes
        super(accountNumber, balance);
        // Assigning withdrawal limit
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding method to specify account type
    @Override
    public String getAccountType()
    {
        // Returning checking account type
        return "Checking Account";
    }

    public void displayAccountDetails()
    {
        // Printing account number
        System.out.println("Account Number: " + accountNumber);

        // Printing current balance
        System.out.println("Balance: $" + balance);

        // Printing account type
        System.out.println("Type: " + getAccountType());

        // Printing the withdrawlimit
        System.out.println("WithdrawLimit: "+ withdrawalLimit);

        // Printing the space to give clear output look
        System.out.println();
    }
}
