package com.hospitalsystem;

// Importing required Java utility package for using ArrayList
import java.util.ArrayList;

// Class representing a Patient in the hospital
class Patient {
    // Private attribute to store the patient's name
    private String patientName;

    // Private list to store doctors assigned to this patient (Many-to-Many Association)
    private ArrayList<Doctor> doctors;

    // Constructor to initialize a Patient name
    public Patient(String patientName) {
        // Assigning the provided patient name to the attribute
        this.patientName = patientName;

        // Initializing the list that will store doctors treating this patient
        this.doctors = new ArrayList<>();
    }

    // Method to add a doctor to the patient's doctor list
    public void addDoctor(Doctor doctor) {
        // Adding the provided doctor object to the doctors list
        doctors.add(doctor);
    }

    // Method to retrieve the patient's name
    public String getPatientName() {
        // Returning the name of the patient
        return patientName;
    }

    // Method to display patient details along with assigned doctors
    public void printPatientDetails() {
        // Printing the patient's name
        System.out.println("Patient: " + patientName);

        // Checking if the patient has assigned doctors
        if (doctors.isEmpty()) {
            System.out.println("No doctors assigned.");
        } else {
            System.out.println("Doctors treating " + patientName + ":");
            for (Doctor doctor : doctors) {
                System.out.println("- " + doctor.getDoctorName());
            }
        }
    }
}





