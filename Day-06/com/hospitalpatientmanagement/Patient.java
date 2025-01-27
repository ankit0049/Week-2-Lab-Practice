package com.hospitalpatientmanagement;


// Abstract class to represent a general patient
abstract class Patient {

	// Field to store the patient ID
	private String patientId;

	// Field to store the name of the patient
	private String name;

	// Field to store the age of the patient
	private int age;

	// Constructor to initialize patient details
	public Patient(String patientId, String name, int age) {
		// Assign the patient ID to the instance variable
		this.patientId = patientId;

		// Assign the name to the instance variable
		this.name = name;

		// Assign the age to the instance variable
		this.age = age;
	}

	// Getter method to retrieve the patient ID
	public String getPatientId() {
		return patientId;
	}

	// Getter method to retrieve the name of the patient
	public String getName() {
		return name;
	}

	// Getter method to retrieve the age of the patient
	public int getAge() {
		return age;
	}

	// Abstract method to calculate the total bill for the patient (implemented by subclasses)
	public abstract double calculateBill();

	// Method to display patient details
	public void getPatientDetails() {
		// Print the patient details: ID, name, and age
		System.out.println("Patient ID: " + patientId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}