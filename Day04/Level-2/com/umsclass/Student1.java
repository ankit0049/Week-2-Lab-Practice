package com.umsclass;

import java.util.ArrayList;

// Class representing a Student
public class Student1
{
    // Private attribute to store the student's name
    private String studentName;

    // Private list to store enrolled courses (Many-to-Many Association)
    private ArrayList<Course1> enrolledCourses;

    // Constructor to initialize a Student object with a name
    public Student1(String studentName)
    {
        // Assigning the provided student name to the attribute
        this.studentName = studentName;
        // Initializing the list that will store enrolled courses
        this.enrolledCourses = new ArrayList<>();
    }

    // Method to enroll a student in a course
    public void enrollCourse(Course1 course)
    {
        // Adding the provided course object to the student's enrolled courses list
        enrolledCourses.add(course);
        // Ensuring bidirectional association: adding student to the course’s student list
        course.addStudent(this);
    }

    // Method to retrieve the student's name
    public String getStudentName()
    {
        return studentName;
    }

    // Method to display student details along with enrolled courses
    public void printStudentDetails()
    {
        // Printing the student's name
        System.out.println("Student: " + studentName);

        // Checking if the student has enrolled in any courses
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled."); // If no courses, display message
        } else {
            System.out.println("Enrolled Courses:");
            // Looping through the list of enrolled courses and printing them
            for (Course1 course : enrolledCourses) {
                System.out.println("- " + course.getCourseName());
            }
        }
    }
}