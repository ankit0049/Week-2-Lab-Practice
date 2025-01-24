package com.hospitalsystem;

import java.util.ArrayList;

// Class representing a Hospital
public class Hospital {
    // Private attribute to store the hospital's name
    private String hospitalName;

    // Private list to store doctors working in the hospital
    private ArrayList<Doctor> doctors;

    // Private list to store patients registered in the hospital
    private ArrayList<Patient> patients;

    // Constructor to initialize a Hospital object with a hospital name
    public Hospital(String hospitalName) {
        // Assigning the provided hospital name to the attribute
        this.hospitalName = hospitalName;

        // Initializing the lists for doctors and patients
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        // Adding the provided doctor object to the doctors list
        doctors.add(doctor);
    }

    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        // Adding the provided patient object to the patients list
        patients.add(patient);
    }

    // Method to display hospital details including doctors and patients
    public void printHospitalDetails() {
        // Printing the hospital's name
        System.out.println("Hospital: " + hospitalName);

        // Checking if the hospital has doctors
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
        } else {
            System.out.println("Doctors in " + hospitalName + ":");
            for (Doctor doctor : doctors) {
                doctor.printDoctorDetails();
            }
        }

        // Checking if the hospital has registered patients
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            System.out.println("Patients in " + hospitalName + ":");
            for (Patient patient : patients) {
                patient.printPatientDetails();
            }
        }
    }
}