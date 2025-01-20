// Create a student class and create attribute named as rollNumber name and CGPA
class Student
{

    // Public attribute rollNumber Can be accessed from anywhere
    public int rollNumber;

    // Protected attribute name Can be accessed in the same package and by subclasses
    protected String name;

    // Private attribute CGPA Can only be accessed within this class
    private double CGPA;

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA)
    {
        // Assigning roll number to instance variable
        this.rollNumber = rollNumber;

        // Assigning name to instance variable
        this.name = name;

        // Assigning CGPA to instance variable
        this.CGPA = CGPA;
    }

    // Public method to set CGPA (since CGPA is private)
    public void setCGPA(double CGPA)
    {
        // Updating the CGPA value
        this.CGPA = CGPA;
    }

    // Public method to get CGPA value
    public double getCGPA()
    {
        // Returning the CGPA value
        return CGPA;
    }

    // Method to display student details
    public void displayStudentDetails()
    {
        // Printing student roll number
        System.out.println("Roll Number: " + rollNumber);

        // Printing student name
        System.out.println("Name: " + name);

        // Printing student CGPA
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass of Student demonstrating protected access
class PostgraduateStudent extends Student
{

    // Constructor for PostgraduateStudent calling the superclass constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA)
    {
        // Calling the parent class constructor to initialize attributes
        super(rollNumber, name, CGPA);
    }

    // Method to display postgraduate student details
    public void displayPGStudent()
    {
        // Accessing public rollNumber and protected name
        System.out.println("Postgraduate Student Roll Number: " + rollNumber);
        System.out.println("Postgraduate Student Name: " + name);
    }
}

class UniversityManagement
{
    public static void main(String[] args)
    {
        // Creating a Student object with roll number, name, and CGPA
        Student student = new Student(24, "Ankit Rajput", 8.34);

        // Displaying student details
        student.displayStudentDetails();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(18, "Amit pawar", 8.71);

        // Displaying postgraduate student details
        pgStudent.displayPGStudent();
    }
}
