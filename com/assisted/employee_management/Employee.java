 package com.assisted.employee_management;

// Defining the superclass Employee
class Employee  
{
    // Declaring the employee's nameOfEmployee
    protected String nameOfEmployee;

    // Declaring the employee's idOfEmployee
    protected int idOfEmployee;

    // Declaring the employee's salary
    protected double salary;

    // Constructor to initialize Employee object
    public Employee(String nameOfEmployee, int idOfEmployee, double salary)  
    {
        this.nameOfEmployee = nameOfEmployee;
        this.idOfEmployee = idOfEmployee;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails()
    {
        System.out.println("Employee nameOfEmployee: " + nameOfEmployee);
        System.out.println("Employee idOfEmployee: " + idOfEmployee);
        System.out.println("Salary: $" + salary);
    }
}