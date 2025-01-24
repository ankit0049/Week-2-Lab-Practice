package com.heirarchical.bankaccount;

// Main class to manage all the bankAccount activity
public class BankControlar
{
    public static void main(String[] args)
    {

        // Creating an instance of SavingsAccount with interest rate
        SavingsAccount savings = new SavingsAccount("Ankit123", 560000, 24);
        // Displaying savings account details
        savings.displayAccountDetails();

        // Creating an instance of SavingsAccount with interest rate
        FixedDepositAccount fixedAccount = new FixedDepositAccount("Rajput123", 680000, 7);
        // Displaying savings account details
        fixedAccount.displayAccountDetails();

        // Creating an instance of SavingsAccount with interest rate
        CheckingAccount checkingAccount = new CheckingAccount("Ankit123", 560000, 250000);
        // Displaying savings account details
        checkingAccount.displayAccountDetails();
    }
}
