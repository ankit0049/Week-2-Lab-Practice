package com.assisted.animal;
class Bird extends Animal
{
    // Constructor to initialize Bird's attributes
    public Bird(String nameOfAnimal, int ageOfAnimal)
    {
        super(nameOfAnimal, ageOfAnimal);
    }

    // Overridden method to specify bird's sound
    @Override
    public void makeSound()
    {
        System.out.println(nameOfAnimal + " chirps: Chi Chi Chi!");
    }
}