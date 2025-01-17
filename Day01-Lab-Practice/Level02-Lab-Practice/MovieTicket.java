package level2;

import java.util.Scanner;

// MovieTicket class models the ticket booking system
public class MovieTicket
{
    // Attribute to store the movie's name
    private String movieName;

    // Attribute to store the seat number
    private String seatNumber;

    // Attribute to store the price of the ticket
    private double price;

    // Constructor to initialize movie ticket details
    public MovieTicket(String movieName, String seatNumber, double price)
    {   // Initializing ticket details
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seat, double ticketPrice)
    {
        // Assigning the seat number
        this.seatNumber = seat;
        // Assigning the ticket price
        this.price = ticketPrice;
        // Prints the booking details
        System.out.println("Ticket booked for seat " + seat + " at price " + ticketPrice);
    }

    // Method to display ticket details
    public void displayTicketDetails()
    {    // Prints the movie name
        System.out.println("Movie Name: " + movieName);

        // Prints the seat number
        System.out.println("Seat Number: " + seatNumber);

        // Prints the ticket price
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get user input of movie ticket details
        System.out.println("Enter Movie Name: ");
        String movieName = sc.nextLine();

        // Taking seat number input
        System.out.println("Enter Seat Number: ");
        String seatNumber = sc.nextLine();

        // Taking ticket price input
        System.out.println("Enter Ticket Price: ");
        double price = sc.nextDouble();

        // Creating a MovieTicket object with the provided details
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        // Booking the ticket and displaying the details
        ticket.bookTicket(seatNumber, price);

        // Displaying the ticket details
        ticket.displayTicketDetails();

        // Closing the Scanner object to prevent resource leak
        sc.close();
    }
}
