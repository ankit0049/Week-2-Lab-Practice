import java.util.Scanner;

public class Book
{
    // Create Attributes of the Book
    private String title;
    private String author;
    private int price;

    // Create a Book Constructor to intialize and assign the value of the attributes
    Book( String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Create a displayBookDetails method to display the details of the book
    private void  displayBookDetails()
    {
        System.out.println("Title of the Book : " + title);
        System.out.println("Author of the Book : "+ author);
        System.out.println("Price of the Book : "+ price + "$");
    }

    public static void main(String[] args)
    {
        // Create a Scanner object to get the user input
        Scanner input = new Scanner(System.in);

       // Create a variable title and get the user input
        System.out.print("Enter the title of the Book : ");
        String title = input.nextLine();

        // Create a variable author and get the user input
        System.out.print("Enter the author of the Book : ");
        String author = input.nextLine();

        // Create a variable price and get the user Input
        System.out.print("Enter the price of the Book : ");
        int price = input.nextInt();

        // Create a detailOne object and assign the user given Values to Instance variables
        Book detailOne = new Book(title , author , price);

        // Make a call and display the Book Details
        detailOne.displayBookDetails();

        // closing the scanner object
        input.close();

    }
}
