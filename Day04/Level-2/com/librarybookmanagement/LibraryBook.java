package com.librarybookmanagement;

// Main class to demonstrate the Library and Book relationship
class LibraryBook {
    public static void main(String[] args) {
        // Create books that can exist independently of libraries
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen");

        // Create libraries
        Library cityLibrary = new Library("City Library");
        Library universityLibrary = new Library("University Library");

        // Add books to the City Library
        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        // Add books to the University Library
        universityLibrary.addBook(book2);
        universityLibrary.addBook(book3);

        // Display books in each library
        cityLibrary.showBooks();
        universityLibrary.showBooks();
    }
}

