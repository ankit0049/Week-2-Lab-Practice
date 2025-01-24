package com.companydepartment;

import java.util.ArrayList;

// Represents a Company that contains multiple Departments
class Company
{
    // Name of the company
    String companyName;
    // List of departments in the company
    ArrayList<Department> departments;

    // Constructor to initialize company details
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display all departments and their employees
    public void showDepartments() {
        System.out.println("Company: " + companyName);
        if (departments.isEmpty()) {
            System.out.println("No departments in the company.");
        } else {
            for (Department department : departments) {
                department.showEmployees();
            }
        }
    }

    // Method to clear all departments and employees (simulating company deletion)
    public void deleteCompany() {
        System.out.println("Deleting company: " + companyName);
        // Clear all departments and their employees
        departments.clear();
        System.out.println("All departments and employees have been removed.");
    }
}
