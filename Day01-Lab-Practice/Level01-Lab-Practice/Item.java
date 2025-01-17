import java.util.Scanner;

// Create a class Item to manage and display the details of the Item
public class Item
{
    // Create a attributes of the Item class name item, itemCode and itemPrice
    private String itemName, itemCode;
    private int price , totalEntity;

    // Create a constructor to intialize tha value of attributes
    Item( String itemName, String itemCode , int price , int totalEntity)
    {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
        this.totalEntity = totalEntity;
    }

    // Create a method displayItemDetails to display the details of the item
    private void displayItemDetails()
    {
        System.out.println("Name of the Item : "+ itemName);
        System.out.println("itemCode of the item : "+ itemCode);
        System.out.println("price of the item : "+ price +"$");
    }

    // Create a CostCalculate method to calculate the Total cost  of the totalEntity and display
    private void CostCalculate()
    {
        System.out.println("Cost of the "+ totalEntity + " item is : "+ (price * totalEntity));
    }
    public static void main(String[] args)
    {
        // Create a Scanner object to get the user input
        Scanner input = new Scanner(System.in);

        // Create a variable Item and get the user input
        System.out.print("Enter the name of the Item : ");
        String itemName = input.nextLine();

        // Create a variable ItemCode and get the user input
        System.out.print("Enter the code of the Item : ");
        String itemCode = input.nextLine();

        // Create a variable price and get the user Input
        System.out.print("Enter the price of the Item : ");
        int price = input.nextInt();

        // Create a entity of the Item
        System.out.println("Enter the number of Item : ");
        int totalEntity  = input.nextInt();

        // Crete item object and assign the value to instance variable
        Item itemObject = new Item(itemName, itemCode, price , totalEntity);

        // Make a call and calculate the cost and display the cost
        itemObject.CostCalculate();

        // make a call and display the ItemDetails
        itemObject.displayItemDetails();

        // close the scanner object
        input.close();
    }
}
