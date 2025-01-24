package com.assisted.animal;

// Subclass representing a Dog
class Dog extends Animal  
{
    // Constructor to initialize Dog's attributes
    public Dog(String nameOfAnimal, int ageOfAnimal) 
    {
        super(nameOfAnimal, ageOfAnimal);
    }

    // Overridden method to specify dog's sound
    @Override
    public void makeSound()  
    {
        System.out.println(nameOfAnimal + " barks: Woof Woof!");
    }
}

