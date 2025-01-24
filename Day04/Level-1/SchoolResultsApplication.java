// Package declaration for the program
package com;

// Class representing a Subject with a name and marks
class Subject
{

    // Variable to store the name of the subject
    String subjectName;

    // Variable to store the marks obtained in the subject
    int marks;

    // Constructor to initialize a Subject object with a name and marks
    public Subject(String subjectName, int marks)
    {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Method to get the subject name
    public String getSubjectName()
    {
        return subjectName;
    }

    // Method to get the marks for the subject
    public int getMarks() {
        return marks;
    }
}

// Class responsible for calculating grades based on marks
class GradeCalculator
{

    // Method to calculate the grade based on the marks
    public String calculateGrade(int marks)
    {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "F";
        }
    }
}

// Class representing a Student with a name and subjects
class Student
{

    // Variable to store the student's name
    String studentName;

    // Variable to store the first subject of the student
    Subject subject1;

    // Variable to store the second subject of the student
    Subject subject2;

    // Constructor to initialize a Student object with a name and two subjects
    public Student(String studentName, Subject subject1, Subject subject2)
    {
        this.studentName = studentName;
        this.subject1 = subject1;
        this.subject2 = subject2;
    }

    // Method to get the student's name
    public String getStudentName() {
        return studentName;
    }

    // Method to display the student's subjects, marks, and grades
    public void showResults()
    {

        // Creating an instance of GradeCalculator to calculate grades
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Retrieving the grade for the first subject
        String grade1 = gradeCalculator.calculateGrade(subject1.getMarks());

        // Displaying the first subject's name, marks, and grade
        System.out.println("Subject: " + subject1.getSubjectName() + " - Marks: " + subject1.getMarks() + " - Grade: " + grade1);

        // Retrieving the grade for the second subject
        String grade2 = gradeCalculator.calculateGrade(subject2.getMarks());

        // Displaying the second subject's name, marks, and grade
        System.out.println("Subject: " + subject2.getSubjectName() + " - Marks: " + subject2.getMarks() + " - Grade: " + grade2);
    }
}

// SchoolResultsApplication class to demonstrate the School Results Application
public class SchoolResultsApplication
{

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating an instance of Subject for Mathematics
        Subject maths = new Subject("Maths", 85);

        // Creating an instance of Subject for Science
        Subject science = new Subject("Science", 95);

        // Creating an instance of Student with a name and two subjects
        Student student1 = new Student("John", maths, science);

        // Displaying the student's name
        System.out.println("Student: " + student1.getStudentName());

        // Calling the method to display the student's results
        student1.showResults();
    }
}