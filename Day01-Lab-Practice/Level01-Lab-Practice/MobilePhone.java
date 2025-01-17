import java.util.Scanner;

public class MobilePhone
{   // Create attributes of the MobilePhone class Name as brand, model and price
    private String brand, model;
    private int price;

    // Create a constructor to intialize the value to the attributes
    MobilePhone(String brand , String model , int price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Create a method displayMobileDetails to display the mobile details
    private void displayMobileDetails()
    {
        System.out.println(" Name of the brand : "+ brand);
        System.out.println(" Name of the model : " + model);
        System.out.println(" price of the mobile : "+ price);
    }

    public static void main(String[] args)
    {
        // Create a Scanner object to get the user input
        Scanner input = new Scanner(System.in);

        // Create a variable brand and get the user input
        System.out.print("Enter the brand of the Item : ");
        String brand = input.nextLine();

        // Create a variable model and get the user input
        System.out.print("Enter the model of the Item : ");
        String model = input.nextLine();

        // Create a variable price and get the user input
        System.out.print("Enter the price of the Item : ");
        int price = input.nextInt();

        // Create a phoneOne object and assign the value to the attributes
        MobilePhone phoneOne = new MobilePhone(brand , model , price);

        // Make a call and display the mobileDetails
        phoneOne.displayMobileDetails();

        // closing the scanner object
        input.close();
    }
}
