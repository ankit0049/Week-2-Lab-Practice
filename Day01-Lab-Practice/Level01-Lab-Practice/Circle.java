import java.util.Scanner;

public class Circle
{
    // Create a radius attribute
    private double radius;
    // Create a final variable PI
    private final  double PI = Math.PI ;

    Circle (double radius)
    {
        this.radius = radius;
    }

    // Create a method  displayArea to display the area


    // Create method to calculate the area of circle
    private double areaOfCircle()
    {
        return (PI * radius * radius);
    }
    private void displayArea(double area)
    {
        System.out.println("Area of the circle : "+ (area));
    }
    public static void main(String[] args)
    {
       // Create a scanner object to get the user Input
       Scanner input = new Scanner(System.in);

       // Get the User Input of the radius
        System.out.print("Enter the radius : ");
        double radius = input.nextDouble();

       // Creating area object and assign the radius
       Circle area = new Circle(radius);

       // Create a circleArea variable and store the result in
       double circleArea = area.areaOfCircle();

       // Make a call and Display the Area
       area.displayArea(circleArea);

       // close the scanner object
        input.close();
    }
}
