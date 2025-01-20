// Create a BankAccount class and attribute accountnumber, accountHolder and balance
class BankAccount
{

  // Create a Instance variable accountNumber
    public long accountNumber;

    // Create a Instance variable accountHolder of type String
    protected String accountHolder;

    // Create a Instance variable balance of type balance
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(long accountNumber, String accountHolder, double balance)
    {
        // Assigning values to instance variables
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount)
    {
        // Adding the deposit amount to the balance
        balance += amount;
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount)
    {
        // Checking if sufficient balance is available
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Public method to get the balance
    public double getBalance()
    {
        // Returning the balance amount
        return balance;
    }
}
// Subclass SavingAcoount and its extends BankAccount
class SavingsAccount extends BankAccount
{

    // Constructor for SavingsAccount calling the superclass constructor
    public SavingsAccount(long accountNumber, String accountHolder, double balance)
    {
        // Calling parent class constructor to initialize attributes
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details
    public void displayAccountDetails()
    {
        // Accessing public accountNumber and protected accountHolder
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

// Main class to test BankAccount and SavingsAccount
class BankSystem
{
    public static void main(String[] args)
    {
        // Creating a SavingsAccount object
        SavingsAccount account = new SavingsAccount(494230489, "Ankit Rajput", 50000.0);

        // Displaying account details
        account.displayAccountDetails();

        // Depositing money
        account.deposit(1500.0);

        // Printing the updated balance
        System.out.println("Updated Balance: $" + account.getBalance());
    }
}
