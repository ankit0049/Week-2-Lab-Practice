// Create a Vehicle class to manage the vehicle details
public class Vehicle
{

    // Static variable shared across all vehicles
    static double registrationFee = 1000.0;

    // Final variable for registration number, cannot be modified once assigned
    final String registrationNumber;

    // Instance variables for vehicle details
    // Name of the vehicle owner
    String ownerName;

    // Type of vehicle (Car, Truck, etc.)
    String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType, String registrationNumber)
    {
        // Initializing owner's name using 'this' keyword
        this.ownerName = ownerName;

        // Initializing type of vehicle using 'this' keyword
        this.vehicleType = vehicleType;

        // Initializing registration number using 'this' keyword
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee)
    {
        // Updating registration fee for all vehicles
        registrationFee = newFee;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails()
    {
        // Checking if the current object is an instance of the Vehicle class
        if (this instanceof Vehicle)
        {
            // Displaying registration fee
            System.out.println("Registration Fee: " + registrationFee);

            // Displaying owner's name
            System.out.println("Owner Name: " + ownerName);

            // Displaying type of vehicle
            System.out.println("Vehicle Type: " + vehicleType);
        }
    }


    public static void main(String[] args)
    {
        // Creating vehicle1 object and initializing details
        Vehicle vehicle1 = new Vehicle("Ankit Rajput", "Car", "0191AL211024");

        // Creating vehicle2 object and initializing details
        Vehicle vehicle2 = new Vehicle("Abhishek Jat", "Truck", "0191AL211005");

        // Displaying details of vehicle1
        vehicle1.displayVehicleDetails();

        // Displaying details of vehicle2
        vehicle2.displayVehicleDetails();

        // Updating registration fee for all vehicles
        updateRegistrationFee(1200.0);

        // Displaying details of vehicle1 after fee update
        vehicle1.displayVehicleDetails();
    }
}
