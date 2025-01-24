package com.universitysystem;

import java.util.ArrayList;

// Class representing a University
public class University
{
    // Private attribute to store the name of the university
    private String universityName;

    // Private list to store the departments (Composition)
    private ArrayList<Department> departments;

    // Constructor to initialize a University object with a university name
    public University(String universityName)
    {   // Assigning the provided university name to the attribute
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department department)
    {
        // Adding the provided department object to the departments list
        departments.add(department);
    }

    // Method to display university details along with its departments
    public void printUniversityDetails()
    {
        // Checking if university has departments
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
        } else {
            System.out.println("Departments in " + universityName + ":");
            for (Department department : departments) {
                department.printDepartmentDetails();
            }
        }
    }

    // Method to delete the university and its departments (Composition)
    public void deleteUniversity()
    {
        // Printing a message before deleting the university
        System.out.println("Deleting university: " + universityName);

        // Clearing all departments
        departments.clear();
    }
}