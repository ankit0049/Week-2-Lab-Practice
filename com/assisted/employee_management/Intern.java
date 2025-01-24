package com.assisted.employee_management;

// Defining the Intern subclass extending Employee
class Intern extends Employee  
{
    // Declaring the duration of the internship in months
    private int duration;

    // Constructor to initialize Intern object
    public Intern(String name, int idOfIntern, double salary, int duration) 
    {
        super(name, idOfIntern, salary);
        this.duration = duration;
    }

    // Overriding displayDetails method to include Intern-specific details
    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}