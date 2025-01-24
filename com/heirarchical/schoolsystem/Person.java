package com.heirarchical.schoolsystem;

// Superclass representing a general person in the school
class Person
{
    // Name of the person
    protected String name;

    // Age of the person
    protected int age;

    // Constructor to initialize name and age
    public Person(String name, int age)
    {
        // Assigning the name to the person
        this.name = name;
        // Assigning the age to the person
        this.age = age;
    }

    // Method to display basic person details
    public void displayDetails()
    {
        // Printing the name of the person
        System.out.println("Name: " + name);
        // Printing the age of the person
        System.out.println("Age: " + age);
    }

    // Method to be overridden by subclasses to describe their role
    public void displayRole()
    {
        // Printing a general role description
        System.out.println("This is a person in the school.");
    }
}