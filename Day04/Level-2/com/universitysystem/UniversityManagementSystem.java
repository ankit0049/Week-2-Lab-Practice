package com.universitysystem;

// UniversityManagementSystem class to demonstrate composition and aggregation
class UniversityManagementSystem
{
    public static void main(String[] args)
    {
        // Creating Faculty objects
        Faculty faculty1 = new Faculty("Ankit Rajpoot");
        Faculty faculty2 = new Faculty("Hemant Rajput");
        Faculty faculty3 = new Faculty("Suyash Rajput");

        // Creating Department objects
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Adding faculty members to departments (Aggregation)
        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);
        mathDepartment.addFaculty(faculty3);

        // Creating a University object
        University university = new University("DVV");

        // Adding departments to the university (Composition)
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Displaying the university details before deletion
        university.printUniversityDetails();

        //Deleting the university (removes all departments)
        university.deleteUniversity();

        university.printUniversityDetails();
    }
}
