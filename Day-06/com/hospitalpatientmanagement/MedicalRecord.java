package com.hospitalpatientmanagement;

// Interface to define medical record management behavior
interface MedicalRecord {

	// Method to add medical records for the patient
	void addRecord(String record);

	// Method to view medical records of the patient
	String viewRecords();
}