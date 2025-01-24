package com.assisted.animal;


// Subclass representing a Cat
class Cat extends Animal  
{
    // Constructor to initialize Cat's attributes
    public Cat(String nameOfAnimal, int ageOfAnimal)  
    {
        super(nameOfAnimal, ageOfAnimal);
    }

    // Overridden method to specify cat's sound
    @Override
    public void makeSound()  
    {
        System.out.println(nameOfAnimal + " meows: Meow Meow!");
    }
}