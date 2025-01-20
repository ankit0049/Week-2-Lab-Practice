// Create a Vehicle class that contains the attributes ownerName and vheicleType and registrationFee
public class Vehicle
{

    // Declaring private instance variable for owner's name
    private String ownerName;

    // Declaring private instance variable for vehicle type
    private String vehicleType;

    // Declaring a static class variable for registration fee
    private static double registrationFee = 100.0;

    // Constructor to initialize a vehicle with owner name and type
    public Vehicle(String ownerName, String vehicleType)
    {
        // Assigning parameter values to instance variables
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display details of a specific vehicle
    public void displayVehicleDetails()
    {
        // Printing the owner's name
        System.out.println("Owner Name: " + ownerName);

        // Printing the vehicle type
        System.out.println("Vehicle Type: " + vehicleType);

        // Printing the registration fee (shared across all vehicles)
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Static method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee)
    {
        // Updating the static registrationFee variable with the new fee
        registrationFee = newFee;
    }

    // Main method to test the Vehicle class
    public static void main(String[] args)
    {
        // Creating the first vehicle instance with owner name and type
        Vehicle vehicle1 = new Vehicle("Ankit Rajput", "Truck");

        // Creating the second vehicle instance with owner name and type
        Vehicle vehicle2 = new Vehicle("Hemant Rajput", "Motorcycle");

        // Printing a separator for readability
        System.out.println("Display Vehicle 1 Details");

        // Displaying details of the first vehicle
        vehicle1.displayVehicleDetails();

        // Printing a separator for readability
        System.out.println(" Display Vehicle 2 Details");

        // Displaying details of the second vehicle
        vehicle2.displayVehicleDetails();

        // Printing a message before updating the registration fee
        System.out.println(" Display the Updating Registration Fee...");

        // Updating the registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0);

        // Printing a separator for readability
        System.out.println("Display Updated Vehicle Details");

        // Displaying details again after updating registration fee
        vehicle1.displayVehicleDetails();

        // Adding space for readability
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
