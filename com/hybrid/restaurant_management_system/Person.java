package com.hybrid.restaurant_management_system;

// Superclass representing a general person
class Person
{

    // Name of the person
    protected String name;

    // Unique ID assigned to the person
    protected int id;

    // Constructor to initialize person details
    public Person(String name, int id)
    {
        // Assigning name to the person
        this.name = name;
        // Assigning unique ID
        this.id = id;
    }

    // Method to display general person details
    public void displayPersonDetails()
    {
        // Printing name of the person
        System.out.println("Name: " + name);
        // Printing ID of the person
        System.out.println("ID: " + id);
    }
}
