package com.librarybookmanagement;

class Book
{
    // Title of the book
    String title;
    // Author of the book
    String author;

    // Constructor to initialize a book with title and author
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    // Override toString() for displaying book details
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

