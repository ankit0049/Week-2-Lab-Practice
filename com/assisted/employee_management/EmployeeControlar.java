package com.assisted.employee_management;

// Main class to demonstrate the Employee hierarchy
public class EmployeeControlar
{
    public static void main(String[] args)
    {
        // Creating an object of Manager class
        Manager manager = new Manager("Ankit rajput",24 , 90000, 6);

        // Creating an object of Developer class
        Developer developer = new Developer("Abhishek Jat", 005, 60000, "Java");

        // Creating an object of Intern class
        Intern intern = new Intern("Ajeet", 12, 12000, 6);

        // Displaying Manager details
        System.out.println("\nManager Details:");
        manager.displayDetails();

        // Displaying Developer details
        System.out.println("\nDeveloper Details:");
        developer.displayDetails();

        // Displaying Intern details
        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}
