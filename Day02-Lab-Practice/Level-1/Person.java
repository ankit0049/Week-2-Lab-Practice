// Create a class person and attributes name and age and intialized using constructor
public class Person
{
    // Declaring private attributes for person details
    private String name;
    private int age;

    // Parameterized constructor to initialize person attributes
    public Person(String name, int age)
    {
        // Assigning values using 'this' keyword
        this.name = name;
        this.age = age;
    }

    // Copy constructor to clone another person's attributes
    public Person(Person ObjectOne)
    {
        // Copies values from the given Person object ObjectOne
        this.name = ObjectOne.name;
        this.age = ObjectOne.age;
    }

    // Method to display person's details
    public void displayDetails()
    {
        // Prints the name of the person
        System.out.println("Name: " + name);
        // Prints the age of the person
        System.out.println("Age: " + age);
    }

    // Main method to test the Person class
    public static void main(String[] args)
    {
        // Creating a Person object using the parameterized constructor
        Person realPersonObject = new Person("Ankit Rajpoot", 20);

        // Creating a Person object using the copy constructor
        Person clonePersonObject = new Person(realPersonObject);

        // Displaying details of the original person
        System.out.println("Displaying the Original Person details");
        realPersonObject.displayDetails();

        // Displaying details of the cloned person
        System.out.println("Displaying the Cloned Person Details");
        clonePersonObject.displayDetails();
    }
}
