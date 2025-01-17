package level2;
import java.util.Scanner;

// Create a class Student to represent the student grade
public class Student
{
    // Attribute to store student's anme
    private String name;

    // Attribute to store student's roll number
    private int rollNumber;

    // Attribute to store student's marks
    private double marks;

    // Constructor to initialize the student's details
    public Student(String name, int rollNumber, double marks)
    {   // Initializing student's details
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade based on marks
    public String calculateGrade()
    {
        if (marks >= 90) {
            // Grade A for marks greater than or equal to 90
            return "A";
        } else if (marks >= 75) {
            // Grade B for marks greater than or equal to 75
            return "B";
        } else if (marks >= 50) {
            // Grade C for marks greater than or equal to 50
            return "C";
        } else {
            // Grade F for marks less than 50
            return "F";
        }
    }

    // Method to display student's details and grade
    public void displayDetails()
    {   // Prints the student's name
        System.out.println("Student Name: " + name);

        // Prints the student's roll number
        System.out.println("Roll Number: " + rollNumber);

        // Prints the student's marks
        System.out.println("Marks: " + marks);

        // Calls the calculateGrade() method and prints the grade
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting user to input student details
        System.out.println("Enter Student Name: ");

        // Taking student name input
        String name = sc.nextLine();
        System.out.println("Enter Roll Number: ");

        // Taking roll number input
        int rollNumber = sc.nextInt();
        System.out.println("Enter Marks: ");

        // Get the marks input
        double marks = sc.nextDouble();

        // Creating a Student object with the provided details
        Student student = new Student(name, rollNumber, marks);

        // Displaying the student's details and grade
        student.displayDetails();

        // Closing the Scanner object to prevent resource leak
        sc.close();
    }
}
