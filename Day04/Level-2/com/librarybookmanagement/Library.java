package com.librarybookmanagement;

import java.util.ArrayList;

// Represents a Library that aggregates multiple Book objects
class Library
{
    // Name of the library
    String libraryName;
    // List of books in the library
    ArrayList<Book> books;

    // Constructor to initialize a library with a name
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        // Add the book to the library's collection
        books.add(book);
    }

    // Method to display all books in the library
    public void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println("- " + book);
            }
        }
    }
}
