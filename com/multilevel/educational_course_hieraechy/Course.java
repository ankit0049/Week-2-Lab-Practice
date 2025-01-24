package com.multilevel.educational_course_hieraechy;

// Base class representing a general course
class Course
{
    // Attribute: Name of the course
    protected String courseName;

    // Attribute: Duration of the course in weeks
    protected int duration;

    // Constructor to initialize course attributes
    public Course(String courseName, int duration)
    {   // set the value in instance variable
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails()
    {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}
