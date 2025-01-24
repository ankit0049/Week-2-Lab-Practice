package com.companydepartment;

// Represents an Employee within a Department
class Employee {
    String name;  // Employee's name
    String role;  // Employee's role in the department

    // Constructor to initialize employee details
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Override toString() for displaying employee details
    public String toString() {
        return "Employee: " + name + ", Role: " + role;
    }
}
