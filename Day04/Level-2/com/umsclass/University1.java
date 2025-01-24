package com.umsclass;

// Importing required Java utility package for using ArrayList
import java.util.ArrayList;

// Class representing a University
public class University1
{
    // Private attribute to store the university name
    private String universityName;

    // Private list to store courses offered by the university
    private ArrayList<Course1> courses;

    // Constructor to initialize a University object with a name
    public University1(String universityName)
    {
        // Assigning the provided university name to the attribute
        this.universityName = universityName;
        // Initializing the list that will store offered courses
        this.courses = new ArrayList<>();
    }

    // Method to add a course to the university
    public void addCourse(Course1 course)
    {
        // Adding the provided course object to the courses list
        courses.add(course);
    }

    // Method to display university details including offered courses
    public void printUniversityDetails()
    {
        // Printing the university's name
        System.out.println("University: " + universityName);

        // Checking if the university offers any courses
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("Offered Courses:");
            // Looping through the list of courses and printing course details
            for (Course1 course : courses) {
                course.printCourseDetails();
            }
        }
    }
}


