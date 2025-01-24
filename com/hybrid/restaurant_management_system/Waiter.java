package com.hybrid.restaurant_management_system;

// Subclass representing a waiter in a restaurant
class Waiter extends Person implements Worker
{
    // Number of tables the waiter is responsible for
    private int tableCount;

    // Constructor to initialize waiter details
    public Waiter(String name, int id, int tableCount)
    {
        // Calling parent constructor to initialize person attributes
        super(name, id);
        // Assigning number of tables handled
        this.tableCount = tableCount;
    }

    // Overriding performDuties() method from Worker interface
    @Override
    public void performDuties()
    {
        // Printing waiter's responsibilities
        System.out.println(name + " is serving " + tableCount + " tables.");
    }

    // Method to display waiter details
    public void displayWaiterDetails()
    {
        // Calling parent method to print common details
        displayPersonDetails();
        // Printing number of tables handled by the waiter
        System.out.println("Tables Served: " + tableCount);
    }
}