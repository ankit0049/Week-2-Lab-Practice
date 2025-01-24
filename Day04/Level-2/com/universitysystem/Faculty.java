package com.universitysystem;

// Class representing a Faculty member
public class Faculty
{
    // Private attribute to store the faculty member's name
    private String facultyName;

    // Constructor to initialize a Faculty object with a faculty name
    public Faculty(String facultyName)
    {
        // Assigning the provided faculty name to the attribute
        this.facultyName = facultyName;
    }

    // Method to retrieve the faculty member's name
    public String getFacultyName()
    {
        return facultyName;
    }

    // Method to display faculty details
    public void printFacultyDetails()
    {
        // Printing faculty member's name
        System.out.println("Faculty Name: " + facultyName);
    }
}