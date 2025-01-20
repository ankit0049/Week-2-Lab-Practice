// Book class that represents a book with title, author, and price attributes
public class Book
{
    // Create a attribute of Book class and make them private
    private String title;
    private String author;
    private double price;

    // Default constructor (No arguments)
    // Default price set to 0.0
    public Book()
    {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor to initialize attributes
    public Book(String title, String author, double price)
    {  // Set the parameter value to the attributes
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test the Book class
    public static void main(String[] args)
    {
        // Creating objects using both constructors
        Book defaultBook = new Book();

        // Using parameterized constructor
        Book customBook = new Book("Atomic Habit", "James Clear", 15.99);


        // Displaying book details
        System.out.println(" Display the Default Book ");
        defaultBook.displayBookDetails();

        System.out.println("\nDisplay the Custom Book");
        customBook.displayBookDetails();
    }
}
