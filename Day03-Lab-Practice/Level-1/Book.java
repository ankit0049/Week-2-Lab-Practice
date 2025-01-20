// Create a class name Book to manage the book details in liabrary
public class Book
{
    // Static variable shared across all books shared by all books
    static String libraryName = "Bhopal CMS Library";

    // Final variable for ISBN
    final String isbn;

    // Title of the book
    String title;

    // Author of the book
    String author;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn)
    {
        // Initializing title using 'this' keyword to resolve ambiguity
        this.title = title;

        // Initializing author using 'this' keyword
        this.author = author;

        // Initializing ISBN using 'this' keyword
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName()
    {
        // Displaying the library name
        System.out.println("Library: " + libraryName);
    }

    // Instance method to display book details
    public void displayBookDetails()
    {
        // Checking if the current object is an instance of the Book class
        if (this instanceof Book)
        {
            // Displaying book details
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args)
    {
        // Creating a Book object  naem book1
        Book book1 = new Book("Java Programming", "Bridge Labz", "0191-AL-21-1024");

        // Creating a Book object name book2
        Book book2 = new Book("Data Structures", "Capgemini", "0191-AL-21-1005-45");

        // Displaying details of the first book
        book1.displayBookDetails();

        // Displaying details of the second book
        book2.displayBookDetails();

        // Displaying the library name
        displayLibraryName();
    }
}
