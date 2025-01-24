package com.umsclass;

// UniversityManagementSystem class to demonstrate student-course and professor-course relationships
public class UML
{
    public static void main(String[] args)
    {
        // Creating Student objects
        Student1 student1 = new Student1("Aayush Rajput");
        Student1 student2 = new Student1("Amit Rajput");
        Student1 student3 = new Student1("Ankit Rajput");

        // Creating Professor objects
        Professor professor1 = new Professor("Dr. Pushpendra");
        Professor professor2 = new Professor("Dr. Ajeet");

        // Creating Course objects
        Course1 course1 = new Course1("Data Structures");
        Course1 course2 = new Course1("Artificial Intelligence");

        // Assigning professors to courses (Aggregation: Professors exist independently)
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Enrolling students in courses (Many-to-Many Association)
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        student3.enrollCourse(course2);

        // Creating a University object
        University1 university = new University1("RGPV");

        // Adding courses to the university
        university.addCourse(course1);
        university.addCourse(course2);

        // Displaying university details including courses, professors, and enrolled students
        university.printUniversityDetails();
    }
}
