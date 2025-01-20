// Book class that represents a book with different access modifiers
class Books
{

    // Public attribute: Accessible from anywhere
    public String ISBN;

    // Protected attribute: Accessible within the same package and subclasses
    protected String title;

    // Private attribute: Accessible only within this class
    private String author;

    // Constructor to initialize book details
    public Books(String ISBN, String title, String author)
    {
        // Assigning ISBN to instance variable
        this.ISBN = ISBN;

        // Assigning title to instance variable
        this.title = title;

        // Assigning author to instance variable
        this.author = author;
    }

    // Public method to set the author name (since author is private)
    public void setAuthor(String author)
    {
        // Updating the author name
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor()
    {
        // Returning the author name
        return author;
    }
}

// Subclass of Book demonstrating access to public and protected attributes
class EBook extends Books
{

    // Constructor for EBook calling the superclass constructor
    public EBook(String ISBN, String title, String author)
    {
        // Calling parent class constructor to initialize attributes
        super(ISBN, title, author);
    }

    // Method to display EBook details
    public void displayEBookDetails()
    {
        // Accessing public ISBN and protected title
        System.out.println("E-Book ISBN: " + ISBN);
        System.out.println("E-Book Title: " + title);
    }
}

 class LibrarySystem
{
    public static void main(String[] args)
    {
        // Creating a Book object with ISBN, title, and author
        Books book = new Books("978-3-16-148410-0", "Java Programming", "Ankit Rajput");

        // Creating an EBook object
        EBook eBook = new EBook("978-0-12-345678-9", "Advanced Java", "Hemant Rajput");

        // Displaying EBook details
        eBook.displayEBookDetails();

        // Setting a new author for the book
        book.setAuthor("Robert Martin");

        // Printing the updated author name
        System.out.println("Updated Book Author: " + book.getAuthor());
    }
}
