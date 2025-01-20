// Create a class name as circle and defines the attributes radius  and use constructor chaining to assign the value
public class Circle
{

    // Create a attribute of Circle class
    private double radius;

    // Default constructor  and make call to Parameterised for create chaining
    public Circle()
    {
        // Calls the parameterized constructor with a default radius value of 1.0
        this(1.0);
    }

    // Parameterized constructor to initialize radius
    public Circle(double radius)
    {
        // Assigns the given radius to the class variable using 'this' keyword
        this.radius = radius;
    }

    // Create a method to display the radius of the circle
    public void displayDetails() {
        // Prints the radius of the circle
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args)
    {
        // Creating an object using the default constructor name
        Circle CircleObjectOne = new Circle();

        // Creating an object using the parameterized constructor with radius 24.0
        Circle CircleObjectTwo = new Circle(24.0);

        // Displaying details of the default circle
        System.out.println(" Display the Default Circle ");
        CircleObjectOne.displayDetails();

        // Displaying details of the custom circle
        System.out.println("Display the Custom Circle ");
        CircleObjectTwo.displayDetails();
    }
}
