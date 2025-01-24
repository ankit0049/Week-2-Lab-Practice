package com.umsclass;

// Class representing a Professor
public class Professor
{
    // Private attribute to store the professor's name
    private String professorName;

    // Constructor to initialize a Professor object with a name
    public Professor(String professorName)
    {
        // Assigning the provided professor name to the attribute
        this.professorName = professorName;
    }

    // Method to retrieve the professor's name
    public String getProfessorName()
    {
        return professorName;
    }
}