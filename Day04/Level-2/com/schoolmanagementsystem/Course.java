package com.schoolmanagementsystem;

import java.util.ArrayList;
// Represents a Course in the school
public class Course
{
    // Name of the course
    String courseName;

    // List of students enrolled in this course
    ArrayList<Student> enrolledStudents;

    // Constructor to initialize course with its name
    public Course(String courseName)
    {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to enroll a student in this course
    public void enrollStudent(Student student)
    {
        // Avoid duplicate entries
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this);
        }
    }

    // Display all students enrolled in this course
    public void showEnrolledStudents()
    {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.name);
        }
    }
}