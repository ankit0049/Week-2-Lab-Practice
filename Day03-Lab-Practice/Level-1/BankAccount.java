// Create a class name BankAccount to manage account details
public class BankAccount
{
    // Static variable bankName shared across all bank accounts
    static String bankName = "SBI Bank";

    // Final variable for account number, cannot be modified after initialization
    final int accountNumber;

    // Instance variables for account holder's details
    String accountHolderName;

    // Create a variable balance to hold Account balance
    double balance;

    // Static variable to count total number of accounts
    static int totalAccounts = 0;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber, double balance)
    {
        // Initializing account holder's name using 'this' keyword to resolve ambiguity
        this.accountHolderName = accountHolderName;

        // Initializing account number using 'this' keyword
        this.accountNumber = accountNumber;

        // Initializing balance using 'this' keyword
        this.balance = balance;

        // Increment total accounts every time a new account is created
        totalAccounts++;
    }

    // Static method to display the total number of accounts
    public static void getTotalAccounts()
    {
        // Displaying the total number of bank accounts created
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    // Instance method to display account details
    public void displayAccountDetails()
    {
        // Checking if the current object is an instance of the BankAccount class
        if (this instanceof BankAccount)
        {
            // Displaying bank details
            System.out.println("Bank: " + bankName);
            // Displaying account holder's name
            System.out.println("Account Holder: " + accountHolderName);
            // Displaying account number
            System.out.println("Account Number: " + accountNumber);
            // Displaying balance
            System.out.println("Balance: " + balance);
        }
    }
    public static void main(String[] args)
    {
        // Creating a bank account object for Ankit Rajput
        BankAccount account1 = new BankAccount("Ankit Rajput", 24, 1500.0);

        // Creating a bank account object for Alice
        BankAccount account2 = new BankAccount("Vinay Jaduan", 25, 2000.0);

        // Displaying details of the first account
        account1.displayAccountDetails();

        // Displaying details of the second account
        account2.displayAccountDetails();

        // Displaying total Accounts created
        getTotalAccounts();
    }
}
