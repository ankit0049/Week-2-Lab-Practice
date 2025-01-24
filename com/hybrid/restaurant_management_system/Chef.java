package com.hybrid.restaurant_management_system;

// Subclass representing a chef in a restaurant
class Chef extends Person implements Worker
{

    // Speciality cuisine of the chef
    private String specialty;

    // Constructor to initialize chef details
    public Chef(String name, int id, String specialty)
    {
        // Calling parent constructor to initialize person attributes
        super(name, id);
        // Assigning specialty cuisine
        this.specialty = specialty;
    }

    // Overriding performDuties() method from Worker interface
    @Override
    public void performDuties()
    {
        // Printing chef's responsibilities
        System.out.println(name + " is preparing " + specialty + " dishes.");
    }

    // Method to display chef details
    public void displayChefDetails()
    {
        // Calling parent method to print common details
        displayPersonDetails();
        // Printing specialty cuisine of the chef
        System.out.println("Specialty: " + specialty);
    }
}