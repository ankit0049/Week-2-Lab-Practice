package com.single_inheritance.library_managementsystem;

// Defining the subclass Author extending Book
class Author extends Book
{
    // Declaring the author's name
    private String nameOfTheAuthor;

    // Declaring the author's biography
    private String bio;

    // Constructor to initialize Author object
    public Author(String title, int publicationYear, String nameOfTheAuthor, String bio)
    {
        // Calling the superclass constructor to set title and publicationYear
        super(title, publicationYear);

        // intializing the instance variable
        this.nameOfTheAuthor = nameOfTheAuthor;
        this.bio = bio;
    }

    // Overriding displayInfo method to include Author-specific details
    @Override
    public void displayInfo()
    {
        // Calling the superclass method to display book details
        super.displayInfo();

        // displaying the author information
        System.out.println("Author: " + nameOfTheAuthor);
        System.out.println("Biography: " + bio);
    }
}