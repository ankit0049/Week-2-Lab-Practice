package com.hospitalpatientmanagement;

public class hospitalManagementSystem {
	// Main method to execute the program
	public static void main(String[] args) {

		// Create an InPatient object with patient ID, name, age, and days stayed
		InPatient inPatient = new InPatient("Cp01", "Anish", 31, 2);

		// Create an OutPatient object with patient ID, name, age, and treatment fee
		OutPatient outPatient = new OutPatient("Cp02", "Mayur", 25, 8000);

		// Add some medical records for the inpatient
		inPatient.addRecord("Admitted with fever.");
		inPatient.addRecord("Undergoing treatment for flu.");

		// Add some medical records for the outpatient
		outPatient.addRecord("Consulted for headache.");
		outPatient.addRecord("Prescribed medications for migraine.");

		// Display inpatient details and medical records
		System.out.println("InPatient Details:");
		inPatient.getPatientDetails();
		System.out.println("Bill: $" + inPatient.calculateBill());
		System.out.println("Medical Records:\n" + inPatient.viewRecords());

		// Display outpatient details and medical records
		System.out.println("\nOutPatient Details:");
		outPatient.getPatientDetails();
		System.out.println("Bill: $" + outPatient.calculateBill());
		System.out.println("Medical Records:\n" + outPatient.viewRecords());
	}
}
