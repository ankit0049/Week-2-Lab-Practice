package com.schoolmanagementsystem;

import java.util.ArrayList;

// Represents a Student in the school
public class Student
{
    // Name of the student
    String name;
    // List of courses the student is enrolled in
    ArrayList<Course> enrolledCourses;

    // Constructor to initialize student with their name
    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Method for the student to enroll in a course
    public void enrollInCourse(Course course) {
        // Avoid duplicate entries
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this);
        }
    }

    // Display all courses the student is enrolled in
    public void showEnrolledCourses()
    {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.courseName);
        }
    }
}


