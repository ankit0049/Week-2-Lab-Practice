package com.multilevel.educational_course_hieraechy;

// Main class to test the program
public class CourseControlor
{
    public static void main(String[] args)
    {
        // Create an instance of PaidOnlineCourse
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 10, "Udemy", true, 100.0, 20.0);

        // Display all details of the paid online course
        System.out.println(" Displaying the Paid Online Course Details ");
        paidCourse.displayPaidOnlineCourseDetails();
    }
}
