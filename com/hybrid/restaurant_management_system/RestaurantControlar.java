package com.hybrid.restaurant_management_system;

public class RestaurantControlar
{
    public static void main(String[] args)
    {

        // Creating an instance of Chef with specialty
        Chef chef = new Chef("Ankit", 24, "Chinese");

        // Displaying chef details
        chef.displayChefDetails();

        // Calling performDuties() to describe the work
        chef.performDuties();

        // Printing a blank line for separation
        System.out.println();

        // Creating an instance of Waiter with table count
        Waiter waiter = new Waiter("Anshul", 102, 5);
        // Displaying waiter details
        waiter.displayWaiterDetails();
        // Calling performDuties() to describe the work
        waiter.performDuties();
    }

}
