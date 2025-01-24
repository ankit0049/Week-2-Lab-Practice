package com.heirarchical.schoolsystem;

// Subclass representing a student in the school
class Student extends Person {

    // Grade or class of the student
    private String grade;

    // Constructor to initialize student details
    public Student(String name, int age, String grade) {
        // Calling the parent constructor to set common attributes
        super(name, age);
        // Assigning the grade of the student
        this.grade = grade;
    }

    // Overriding displayRole() to describe the student's role
    @Override
    public void displayRole() {
        // Printing the role description of a student
        System.out.println(name + " is a Student studying in grade " + grade + ".");
    }

    // Method to display student-specific details
    public void displayStudentDetails() {
        // Calling parent method to display common details
        displayDetails();
        // Printing the grade of the student
        System.out.println("Grade: " + grade);
    }
}
