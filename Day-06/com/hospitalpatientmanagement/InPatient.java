package com.hospitalpatientmanagement;

// Class representing an inpatient, which is a type of patient
// It extends the Patient class and implements the MedicalRecord interface
class InPatient extends Patient implements MedicalRecord {

	// Field to store the days the inpatient stays in the hospital
	private int daysStayed;

	// Field to store medical records of the inpatient
	private StringBuilder records;

	// Constructor to initialize inpatient details
	public InPatient(String patientId, String name, int age, int daysStayed) {
		// Call the parent class constructor to initialize common patient details
		super(patientId, name, age);

		// Initialize the number of days stayed
		this.daysStayed = daysStayed;

		// Initialize the records field
		this.records = new StringBuilder();
	}

	// Override the abstract method to calculate the total bill for an inpatient
	@Override
	public double calculateBill() {
		// Assume a daily charge of $100 for inpatient care
		return daysStayed * 100;
	}

	// Override the method to add a medical record
	@Override
	public void addRecord(String record) {
		// Append the new record to the records string
		records.append(record).append("\n");
	}

	// Override the method to view all medical records
	@Override
	public String viewRecords() {
		// Return the medical records as a string
		return records.toString();
	}
}
