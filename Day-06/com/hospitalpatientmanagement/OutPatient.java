package com.hospitalpatientmanagement;

/* Class representing an outpatient, which is another type of patient
 It extends the Patient class and implements the MedicalRecord interface */
class OutPatient extends Patient implements MedicalRecord {

	// Field to store the treatment fee for the outpatient
	private double treatmentFee;

	// Field to store medical records of the outpatient
	private StringBuilder records;

	// Constructor to initialize outpatient details
	public OutPatient(String patientId, String name, int age, double treatmentFee) {
		// Call the parent class constructor to initialize common patient details
		super(patientId, name, age);

		// Initialize the treatment fee
		this.treatmentFee = treatmentFee;

		// Initialize the records field
		this.records = new StringBuilder();
	}

	// Override the abstract method to calculate the total bill for an outpatient
	@Override
	public double calculateBill() {
		// Return the treatment fee as the bill for outpatient care
		return treatmentFee;
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
