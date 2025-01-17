import java.util.Scanner;

// CartItem Class: Represents an item in the shopping cart with attributes item name, price, and quantity.
public class CartItem
{
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize item attributes
    public CartItem(String itemName, double price, int quantity)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add an item to the cart
    public void addItem(int quantity)
    {
        this.quantity += quantity;
        System.out.println("Number of added Item: " + quantity);
    }

    // Method to remove an item from the cart
    public void removeItem(int quantity)
    {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println("Number of remove Item: " + quantity);
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    // Method to calculate the total cost
    public double calculateTotalCost()
    {
        return price * quantity;
    }

    // Method to display the total cost
    public void displayCartDetails()
    {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method to demonstrate the CartItem class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter number of added Item to cart: ");
        int addedItem = scanner.nextInt();

        System.out.print("Enter number of removed Item from cart: ");
        int removedItem = scanner.nextInt();

        // Create a CartItem object
        CartItem cartItem = new CartItem(itemName, price, quantity);

        // Add Item, Remove Item and Display cart item details
        cartItem.addItem(addedItem);
        cartItem.removeItem(removedItem);
        cartItem.displayCartDetails();

        // Close the scanner object
        scanner.close();
    }
}