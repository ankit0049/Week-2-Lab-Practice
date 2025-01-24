package com.heirarchical.schoolsystem;

// Subclass representing a teacher in the school
class Teacher extends Person {

    // Subject that the teacher teaches
    private String subject;

    // Constructor to initialize teacher details
    public Teacher(String name, int age, String subject) {
        // Calling the parent constructor to set common attributes
        super(name, age);
        // Assigning the subject taught by the teacher
        this.subject = subject;
    }

    // Overriding displayRole() to describe the teacher's role
    @Override
    public void displayRole() {
        // Printing the role description of a teacher
        System.out.println(name + " is a Teacher who teaches " + subject + ".");
    }

    // Method to display teacher-specific details
    public void displayTeacherDetails() {
        // Calling parent method to display common details
        displayDetails();
        // Printing the subject taught by the teacher
        System.out.println("Subject: " + subject);
    }
}

