
// Created a class HotelBooking and define the attributes guestName roomType and nights
public class HotelBooking
{
    // Create a attributes name as guestName , roomType , and nights
    private String guestName;
    private String roomType;
    private double nights;


    // Created constructor and assign the default values
    public HotelBooking()
    {
        this.guestName = "Anish Rajoot";
        this.roomType = "Standard Ac room";
        this.nights = 1.0;
    }

    // Created a parameterised constructor and assign the values
    public  HotelBooking(String guestName , String roomType , double nights)
    {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }


    // Create a constructor and clone the attributes of another Object
    public HotelBooking(HotelBooking hotelObject)
    {
        this.guestName = hotelObject.guestName;
        this.roomType = hotelObject.roomType;
        this.nights = hotelObject.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        // Prints the guest's name
        System.out.println("Guest Name: " + guestName);
        // Prints the type of room booked
        System.out.println("Room Type: " + roomType);
        // Prints the number of nights booked
        System.out.println("Nights: " + nights);
    }

    public  static void main(String args[])
    {   //  Creating a hotelOne object to intialized the default constructor
        HotelBooking hotelOne = new HotelBooking();

        // Creating a hotelTwo object to intialized the parameterised constructor
        HotelBooking hotelTwo = new HotelBooking("Ankit Rajpoot" , "Standard" , 5.0);

        // Creating a hotelThree Object and clone the attribute of hotelTwo Object
        HotelBooking hotelThree = new HotelBooking(hotelTwo);

        // Displaying the default values
        hotelOne.displayBooking();

        // Display the user given values
        hotelTwo.displayBooking();

        // Displaying the clone value of hotelObjectTwo
        hotelThree.displayBooking();
    }
}
