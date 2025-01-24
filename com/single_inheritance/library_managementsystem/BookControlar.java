package com.single_inheritance.library_managementsystem;

// Create a class to manage all books
public class BookControlar
{
    public static void main(String[] args)
    {
        // Creating an Author object with book details
        Author authorOfTheBook = new Author("The Java Core Fundamentals", 2021, "lil wick", "An experienced Java developer and writer.");

        // Displaying the details of the book along with the author
        authorOfTheBook.displayInfo();
    }
}
