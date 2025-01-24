package com.multilevel.educational_course_hieraechy;


// Subclass representing an online course
class OnlineCourse extends Course
{
    // Attribute: Platform where the course is hosted
    protected String platform;

    // Attribute: Indicates if the course is recorded
    protected boolean isRecorded;

    // Constructor to initialize online course attributes
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded)
    {   // Call the constructor of the base class
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Method to display online course details
    public void displayOnlineCourseDetails()
    {
        displayCourseDetails(); // Call the method from the base class
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}