package com.umsclass;

import java.util.ArrayList;

// Class representing a Course
class Course1
{
    // Private attribute to store the course name
    private String courseName;

    // Private attribute to store the assigned professor (Aggregation: Professor exists independently)
    private Professor professor;

    // Private list to store students enrolled in this course (Many-to-Many Association)
    private ArrayList<Student1> enrolledStudents;

    // Constructor to initialize a Course object with a name
    public Course1(String courseName)
    {
        // Assigning the provided course name to the attribute
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor)
    {
        // Assigning the provided professor to this course
        this.professor = professor;
    }

    // Method to add a student to the course
    public void addStudent(Student1 student)
    {
        // Adding the provided student object to the enrolled students list
        enrolledStudents.add(student);
    }

    // Method to retrieve the course name
    public String getCourseName()
    {
        return courseName;
    }

    // Method to display course details including the assigned professor and enrolled students
    public void printCourseDetails()
    {
        // Printing the course name
        System.out.println("Course: " + courseName);

        // Checking if a professor is assigned to the course
        if (professor == null) {
            System.out.println("No professor assigned.");
        } else {
            System.out.println("Professor: " + professor.getProfessorName());
        }

        // Checking if students are enrolled in the course
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            System.out.println("Enrolled Students:");
            // Looping through the list of enrolled students and printing their names
            for (Student1 student : enrolledStudents) {
                System.out.println("- " + student.getStudentName());
            }
        }
    }
}
