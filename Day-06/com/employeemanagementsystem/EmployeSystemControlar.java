package com.employeemanagementsystem;

public class EmployeSystemControlar {
	public static void main(String[] args) {

		// Creating a full-time employee instance
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(781, "Ankit", 590080);
		fullTimeEmployee.assignDepartment("Native Development");

		// Displaying details of the full-time employee
		System.out.println("Full-Time Employee Details are:");
		fullTimeEmployee.displayDetails();
		System.out.println(fullTimeEmployee.getDepartmentDetails());
		System.out.println("Salary: $" + fullTimeEmployee.calculateSalary());

		// Creating a part-time employee instance
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee(112, "Amit", 54, 25);
		partTimeEmployee.assignDepartment("Technical Support");

		// Displaying details of the part-time employee
		System.out.println("\nPart-Time Employee Details:");
		partTimeEmployee.displayDetails();
		System.out.println(partTimeEmployee.getDepartmentDetails());
		System.out.println("Salary: $" + partTimeEmployee.calculateSalary());
	}
}
