package com.assisted.employee_management;

// Defining the Developer subclass extending Employee
class Developer extends Employee
{
    // Declaring the primary programming language of the developer
    private String programmingLanguage;

    // Constructor to initialize Developer object
    public Developer(String nameOfEmployee, int idOfEmployee, double salary, String programmingLanguage) {
        super(nameOfEmployee, idOfEmployee, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Override displayDetails method to include Developer-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}