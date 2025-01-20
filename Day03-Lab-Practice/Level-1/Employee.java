// Create a class name Employee to Manage the employee details
public class Employee
{

    // Static variable shared across all employees
    static String companyName = "Capgemini X Bridge Labz";

    // Final variable for employee ID unchangeable once assigned
    final int id;

    // Instance variables Employee's name for employee details
    String name;

    // Employee's job title
    String designation;

    // Create a class variable employeeCounter
    private static int employeeCounter = 0;

    // Constructor to initialize employee details
    public Employee(String name, int id, String designation)
    {
        // Initializing name using 'this' keyword to resolve ambiguity
        this.name = name;

        // Initializing id using 'this' keyword
        this.id = id;

        // Initializing designation using 'this' keyword
        this.designation = designation;

        // Increment everytime When new Employee created
        employeeCounter++;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees()
    {
        // Displaying the total number of employees
        System.out.println("Total Employees in " + companyName + " is " + employeeCounter);
    }

    // Instance method to display employee details
    public void displayEmployeeDetails()
    {
        // Checking if the current object is an instance of the Employee class
        if (this instanceof Employee)
         {
            // Displaying employee details
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }


    public static void main(String[] args)
    {
        // Creating an Employee object for John
        Employee emp1 = new Employee("Abhishek JAt", 101, "Software Engineer");

        // Creating an Employee object for Alice
        Employee emp2 = new Employee("Ankiit Rajput", 102, "HR Manager");

        // Displaying details of the first employee
        emp1.displayEmployeeDetails();

        // Displaying details of the second employee
        emp2.displayEmployeeDetails();

        // Displaying the total number of employees
        displayTotalEmployees();
    }
}
