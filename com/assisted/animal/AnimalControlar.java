package com.assisted.animal;

// Create a class manage the all animal class and make the calls of the object
public class AnimalControlar
{
    public static void main(String[] args)
    {
        // Creating objects for different animals
        Dog dog = new Dog("Charlie777", 5);
        Cat cat = new Cat("zaggy", 3);
        Bird bird = new Bird("sparrow", 2);

        // Displaying details and sounds for dog
        dog.displayDetails();
        dog.makeSound();

        // Displaying details and sounds for cat
        cat.displayDetails();
        cat.makeSound();

        // Displaying details and sounds for bird
        bird.displayDetails();
        bird.makeSound();
    }
}
