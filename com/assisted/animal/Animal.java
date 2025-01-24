package com.assisted.animal;
// Superclass representing a general Animal
public class Animal  
{

    // Create a attribute name nameOfAnimal
    protected String nameOfAnimal;

    //  Create a attribute name ageOfAnimal
    protected int ageOfAnimal;

    // Constructor to initialize nameOfAnimal and ageOfAnimal
    public Animal(String nameOfAnimal, int ageOfAnimal)
    {
        this.nameOfAnimal = nameOfAnimal;
        this.ageOfAnimal = ageOfAnimal;
    }

    // Method to be overridden by subclasses for making sound
    public void makeSound()
    {
        System.out.println("Animal makes a sound");
    }

    // Method to display animal details
    public void displayDetails()
    {
        System.out.println("nameOfAnimal: " + nameOfAnimal + ", ageOfAnimal: " + ageOfAnimal);
    }
}