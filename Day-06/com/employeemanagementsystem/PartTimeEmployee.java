package com.employeemanagementsystem;
// Subclass representing a part-time employee
class PartTimeEmployee extends Employee implements Department {

	// Private field to store the hourly rate of the employee
	private double hourlyRate;

	// Private field to store the number of hours worked
	private int hoursWorked;

	// Private field to store the department name
	private String department;

	// Constructor to initialize part-time employee details
	public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
		super(employeeId, name, 0); // Base salary set to 0
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	// Method to calculate the salary for a part-time employee
	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}

	// Method to assign a department to the part-time employee
	@Override
	public void assignDepartment(String departmentName) {
		this.department = departmentName;
	}

	// Method to retrieve the department details
	@Override
	public String getDepartmentDetails() {
		return "Department: " + department;
	}
}