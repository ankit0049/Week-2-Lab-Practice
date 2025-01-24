package com.companydepartment;

import java.util.ArrayList;

// Represents a Department within a Company
class Department
{
    // Name of the department
    String departmentName;
    // List of employees in the department
    ArrayList<Employee> employees;

    // Constructor to initialize department details
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    // Display all employees in the department
    public void showEmployees() {
        System.out.println("Department: " + departmentName);
        if (employees.isEmpty()) {
            System.out.println("No employees in this department.");
        } else {
            for (Employee employee : employees) {
                System.out.println("- " + employee);
            }
        }
    }
}
