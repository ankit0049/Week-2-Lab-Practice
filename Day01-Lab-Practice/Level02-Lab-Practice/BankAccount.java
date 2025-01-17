package level2;

import java.util.Scanner;

// BankAccount class models the details of a bank account
public class BankAccount
{
    // Attribute to store account holder's name
    private String accountHolder;

    // Attribute to store account number
    private String accountNumber;

    // Attribute to store the current balance
    private double balance;


    // Constructor to initialize bank account details
    public BankAccount(String accountHolder, String accountNumber, double balance)
    {
        // Initializing account holder's name
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount)
    {   // Adding the deposited amount to the balance
        balance += amount;
        // Prints the deposited amount
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money from the account (only if sufficient balance exists)
    public void withdraw(double amount)
    {
        if (balance >= amount) {
            // Subtracting the withdrawn amount from the balance
            balance -= amount;
            // Prints the withdrawn amount
            System.out.println("Withdrew: " + amount);
        } else {
            // Prints a message if insufficient balance
            System.out.println("Insufficient funds!");
        }
    }

    // Method to display the current balance
    public void displayBalance()
    {   // Prints the current balance
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the user input to enter account details
        // Taking account holder's name input
        System.out.print("Enter Account Holder's Name: ");
        String accountHolder = sc.nextLine();

        // Taking account number input
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        // Taking the initial balance input
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Taking the deposit input
        System.out.print(" Enter deposit balance: ");
        double deposit = sc.nextDouble();

        // Taking the withdraw input
        System.out.println(" Enter withdraw balance: ");
        double withdraw = sc.nextDouble();

        // Creating a BankAccount object with the provided details
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        // Depositing money into the account
        account.deposit(deposit);

        // Withdrawing money from the account
        account.withdraw(withdraw);

        // Displaying the current balance
        account.displayBalance();

        // Closing the Scanner object to prevent resource leak
        sc.close();
    }
}
