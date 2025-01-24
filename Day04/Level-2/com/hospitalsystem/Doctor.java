package com.hospitalsystem;

import java.util.ArrayList;// Class representing a Doctor in the hospital
public class Doctor {
    // Private attribute to store the doctor's name
    private String doctorName;

    // Private list to store patients assigned to this doctor (Many-to-Many Association)
    private ArrayList<Patient> patients;

    // Constructor to initialize a Doctor name
    public Doctor(String doctorName) {
        // Assigning the provided doctor name to the attribute
        this.doctorName = doctorName;

        // Initializing the list that will store patients assigned to this doctor
        this.patients = new ArrayList<>();
    }

    // Method to add a patient to the doctor's patient list
    public void addPatient(Patient patient) {
        // Adding the provided patient object to the patients list
        patients.add(patient);

        // Ensuring bidirectional association: adding the doctor to the patient’s doctor list
        patient.addDoctor(this);
    }

    // Method to conduct a consultation between a doctor and a patient
    public void consult(Patient patient) {
        // Printing consultation message between doctor and patient
        System.out.println("Doctor " + doctorName + " is consulting Patient " + patient.getPatientName());
    }

    // Method to retrieve the doctor's name
    public String getDoctorName() {
        // Returning the name of the doctor
        return doctorName;
    }

    // Method to display doctor details along with assigned patients
    public void printDoctorDetails() {
        // Printing the doctor's name
        System.out.println("Doctor: " + doctorName);

        // Checking if the doctor has assigned patients
        if (patients.isEmpty()) {
            System.out.println("No patients assigned.");
        } else {
            System.out.println("Patients under " + doctorName + ":");
            for (Patient patient : patients) {
                System.out.println("- " + patient.getPatientName());
            }
        }
    }
}