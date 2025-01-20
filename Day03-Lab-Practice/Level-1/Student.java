// Create  a class name Student to manage the detail sof the student
public class Student
{
    // Static variable shared across all students
    static String universityName = "RGPV UNIVERSITY";

    // Final variable for roll number (unchangeable)
    final int rollNumber;

    // Name of the student
    String name;

    // Grade of the student
    double grade;

    // Create a class variable totalStudent that shared among all objects
    private static  int totalStudent = 0;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, double grade)
    {
        // Initializing name using 'this' keyword
        this.name = name;

        // Initializing roll number using 'this' keyword
        this.rollNumber = rollNumber;

        // Initializing grade using 'this' keyword
        this.grade = grade;

        // Increment totalStudent everytime by one
        totalStudent++;
    }

    // Static method to display total number of students
    public static void displayTotalStudents()
    {
        // Displaying total number of students in the university
        System.out.println("Total Students in " + universityName +" is "+ totalStudent);
    }

    // Instance method to display student details
    public void displayStudentDetails()
    {
        // Checking if the current object is an instance of the Student class
        if (this instanceof Student)
        {
            // Displaying university name
            System.out.println("University: " + universityName);

            // Displaying student's name
            System.out.println("Student Name: " + name);

            // Displaying student's roll number
            System.out.println("Roll Number: " + rollNumber);

            // Displaying student's grade
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args)
    {
        // Creating student1 object and initializing details
        Student student1 = new Student("Ankit Rajput", 24, 83.4);

        // Creating student2 object and initializing details
        Student student2 = new Student("Abhishek Jat", 05, 83.4);

        // Displaying details of student1
        student1.displayStudentDetails();

        // Displaying details of student2
        student2.displayStudentDetails();

        // Displaying total number of students
        displayTotalStudents();
    }
}
