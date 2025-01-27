package com.employeemanagementsystem;

// Subclass representing a full-time employee
class FullTimeEmployee extends Employee implements Department {

	// Private field to store the department name
	private String department;

	// Constructor to initialize full-time employee details
	public FullTimeEmployee(int employeeId, String name, double baseSalary) {
		super(employeeId, name, baseSalary);
	}

	// Method to calculate the salary for a full-time employee
	@Override
	public double calculateSalary() {
		return getBaseSalary();
	}

	// Method to assign a department to the full-time employee
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