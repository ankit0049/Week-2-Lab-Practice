package com.bankaccount;

// Main class to demonstrate the Bank-Customer relationship
class BankAccount {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Global Bank");

        // Create customers
        Customer ajeet = new Customer("Ajeet Raj");
        Customer amit = new Customer("Amit Raj");

        // Add customers to the bank
        bank.addCustomer(ajeet);
        bank.addCustomer(amit);

        // Open accounts for customers
        bank.openAccount(amit, "ACC12345", 1000.00);
        bank.openAccount(ajeet, "ACC67890", 2000.00);
        bank.openAccount(amit, "ACC54321", 500.00);

        // Show bank customers
        bank.showCustomers();

        // View accounts and balances for each customer
        ajeet.viewAccounts();
        amit.viewAccounts();

        // Demonstrate account transactions
        ajeet.accounts.get(0).deposit(500);
        ajeet.accounts.get(0).withdraw(300);
        ajeet.accounts.get(0).viewBalance();
    }
}

