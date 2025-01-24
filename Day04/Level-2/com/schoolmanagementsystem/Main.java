package com.schoolmanagementsystem;

// Main class to demonstrate the School, Students, and Courses
public class Main
{
    public static void main(String[] args)
    {
        // Create a school
        School school = new School("TIT_EX");

        // Create students
        Student ajeet = new Student("Ajeet");
        Student amit = new Student("Amit");

        // Add students to the school
        school.addStudent(ajeet);
        school.addStudent(amit);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        ajeet.enrollInCourse(math);
        ajeet.enrollInCourse(science);
        amit.enrollInCourse(science);

        // Show all students in the school
        school.showStudents();

        // Show each student's enrolled courses
        ajeet.showEnrolledCourses();
        amit.showEnrolledCourses();

        // Show students enrolled in each course
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}