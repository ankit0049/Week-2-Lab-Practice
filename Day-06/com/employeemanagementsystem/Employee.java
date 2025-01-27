package com.employeemanagementsystem;

// Abstract class representing a general employee
abstract class Employee {

	// Private field to store the employee ID
	private int employeeId;

	// Private field to store the employee's name
	private String name;

	// Private field to store the base salary of the employee
	private double baseSalary;

	// Constructor to initialize employee details
	public Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// Getter method to retrieve the employee ID
	public int getEmployeeId() {
		return employeeId;
	}

	// Getter method to retrieve the employee's name
	public String getName() {
		return name;
	}

	// Getter method to retrieve the base salary
	public double getBaseSalary() {
		return baseSalary;
	}

	// Abstract method to calculate the salary of the employee
	public abstract double calculateSalary();

	// Method to display the details of the employee
	public void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Base Salary: $" + baseSalary);
	}
}