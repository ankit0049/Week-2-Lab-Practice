package com.heirarchical.schoolsystem;

public class SchoolSystemControlar
{
    public static void main(String[] args)
    {

        // Creating an instance of Teacher with subject specialization
        Teacher teacher = new Teacher("Mr. vinay Khare", 38, "Physics");
        // Displaying teacher details
        teacher.displayTeacherDetails();
        // Calling displayRole() to describe the role
        teacher.displayRole();

        // Printing a blank line for separation
        System.out.println();

        // Creating an instance of Student with grade level
        Student student = new Student("Ankit Rajput", 17, "12th Grade");
        // Displaying student details
        student.displayStudentDetails();
        // Calling displayRole() to describe the role
        student.displayRole();

        // Printing a blank line for separation
        System.out.println();

        // Creating an instance of Staff with job title
        Staff staff = new Staff("Amit lowanshi", 29, "Librarian");
        // Displaying staff details
        staff.displayStaffDetails();
        // Calling displayRole() to describe the role
        staff.displayRole();
    }
}
