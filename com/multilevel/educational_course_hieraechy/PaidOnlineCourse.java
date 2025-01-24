package com.multilevel.educational_course_hieraechy;

// Subclass representing a paid online course
class PaidOnlineCourse extends OnlineCourse
{
    // Attribute: Fee for the course
    private double fee;

    // Attribute: Discount available for the course
    private double discount;

    // Constructor to initialize paid online course attributes
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount)
    {   // Call the constructor of the online course class
        super(courseName, duration, platform, isRecorded);

        // Intialiaze the instance variable and set the parameter value
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate the final price after applying the discount
    public double calculateFinalPrice()
    {
        return fee - (fee * discount / 100);
    }

    // Method to display all details of the paid online course
    public void displayPaidOnlineCourseDetails()
    {   // Call the method from the online course class
        displayOnlineCourseDetails();

        // displaying the details of course
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + calculateFinalPrice());
    }
}
