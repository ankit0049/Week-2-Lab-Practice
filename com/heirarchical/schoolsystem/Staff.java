package com.heirarchical.schoolsystem;

// Subclass representing a staff member in the school
class Staff extends Person
{

    // Job position of the staff member
    private String jobTitle;

    // Constructor to initialize staff details
    public Staff(String name, int age, String jobTitle)
    {
        // Calling the parent constructor to set common attributes
        super(name, age);
        // Assigning the job title of the staff member
        this.jobTitle = jobTitle;
    }

    // Overriding displayRole() to describe the staff's role
    @Override
    public void displayRole()
    {
        // Printing the role description of a staff member
        System.out.println(name + " is a Staff member working as " + jobTitle + ".");
    }

    // Method to display staff-specific details
    public void displayStaffDetails()
    {
        // Calling parent method to display common details
        displayDetails();
        // Printing the job title of the staff member
        System.out.println("Job Title: " + jobTitle);
    }
}
