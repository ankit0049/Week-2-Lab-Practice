package com.hospitalsystem;


// HospitalManagementSystem class to demonstrate doctor-patient consultations
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating Doctor objects
        Doctor doctor1 = new Doctor("Dr. Abhishek");
        Doctor doctor2 = new Doctor("Dr. Ajeet");

        // Creating Patient objects
        Patient patient1 = new Patient("Ankit");
        Patient patient2 = new Patient("Amit");

        // Creating a Hospital object
        Hospital hospital = new Hospital("AIIMS Hospital");

        // Adding doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Adding patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Assigning patients to doctors (Many-to-Many Association)
        doctor1.addPatient(patient1); // Dr. Abhishek treats Ankit
        doctor2.addPatient(patient1); // Dr. Ajeet also treats Ankit
        doctor2.addPatient(patient2); // Dr. Ajeet treats Amit

        // Conducting consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor2.consult(patient2);

        // Displaying hospital details
        hospital.printHospitalDetails();
    }
}