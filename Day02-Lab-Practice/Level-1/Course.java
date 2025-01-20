// Create a Course class and its attribute are ci=ourseNamem duration and fee
public class Course
{

    // Create private instance variable for course name
    private String courseName;

    // Create a private instance variable for course duration in weeks
    private int duration;

    // Creating a private instance variable for course fee
    private double fee;

    // Creating a static class variable for the institute name
    private static String instituteName = "Tech Academy";

    // Constructor to initialize a course with name, duration, and fee
    public Course(String courseName, int duration, double fee)
    {
        // Assigning parameter values to instance variables using '
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display details of a specific course
    public void displayCourseDetails()
    {
        // Printing the course name
        System.out.println("Course Name: " + courseName);

        // Printing the course duration in weeks
        System.out.println("Duration: " + duration + " weeks");

        // Printing the course fee
        System.out.println("Fee: $" + fee);

        // Printing the institute name (shared across all courses)
        System.out.println("Institute: " + instituteName);
    }

    // Static method to update the institute name for all courses
    public static void updateInstituteName(String newName)
    {
        // Updating the static instituteName variable with the new name
        instituteName = newName;
    }

    // Main method to test the Course class
    public static void main(String[] args)
    {
        // Creating the first course instance with name, duration, and fee
        Course course1 = new Course("Java Programming Fundamental", 6, 300.0);

        // Creating the second course instance with name, duration, and fee
        Course course2 = new Course("Java Backend Course", 8, 400.0);

        // Printing a separator for readability
        System.out.println("=== Course 1 Details ===");

        // Displaying details of the first course
        course1.displayCourseDetails();

        // Printing a separator for readability
        System.out.println("\n=== Course 2 Details ===");

        // Displaying details of the second course
        course2.displayCourseDetails();

        // Printing a message before updating the institute name
        System.out.println("\nUpdating Institute Name...");

        // Updating the institute name for all courses
        Course.updateInstituteName("Elite Tech Institute");

        // Printing a separator for readability
        System.out.println("Displaying the Updated Course Details ");

        // Displaying details again after updating institute name
        course1.displayCourseDetails();
        
        System.out.println();

        course2.displayCourseDetails();
    }
}
