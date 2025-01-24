package com.schoolmanagementsystem;

import java.util.ArrayList;

// Represents a School that contains multiple students
public class School
{
    // Name of the school
    String schoolName;
    // List of students in the school
    ArrayList<Student> students;

    // Constructor to initialize the school with its name
    public School(String schoolName)
    {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        // Avoid duplicate entries
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display all students in the school
    public void showStudents()
    {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}
