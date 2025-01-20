// Create a class name Product to manage the details of the product
public class Product
{
    // Static variable shared across all products
    static double discount = 10.0;

    // Final variable for product ID
    final int productID;

    // Instance variables for product details
    // Name of the product
    String productName;

    // Price of the product
    double price;

    // Quantity of the product
    int quantity;

    // Constructor to initialize product details
    public Product(String productName, double price, int quantity, int productID)
    {
        // Initializing product name using 'this' keyword to resolve ambiguity
        this.productName = productName;

        // Initializing price using 'this' keyword Set product's price
        this.price = price;

        // Initializing quantity using 'this' keyword Set quantity of product
        this.quantity = quantity;

        // Initializing product ID using 'this' keyword
        this.productID = productID;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount)
    {
        // Updating the static discount variable to newDiscount
        discount = newDiscount;
    }

    // Instance method to calculate total price for the product
    public double calculateTotalPrice()
    {
        // Calculating total price considering the discount
        double totalPrice = price * quantity * (1 - discount / 100);

        // Return the total price after discount
        return totalPrice;
    }

    // Instance method to display product details
    public void displayProductDetails()
    {
        // Checking if the current object is an instance of the Product class
        if (this instanceof Product)
        {
            // Displaying product details
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price (after discount): " + calculateTotalPrice());
        }
    }

    public static void main(String[] args)
    {
        // Creating a Product object for "Laptop"
        Product product1 = new Product("CG-product", 8000000.0, 2, 24);

        // Creating a Product object for "Smartphone"
        Product product2 = new Product("Bridge Labz Product", 500000.0, 3, 24);

        // Displaying details of the first product
        product1.displayProductDetails();

        // Displaying details of the second product
        product2.displayProductDetails();

        // Updating the discount to 60%
        updateDiscount(60.0);

        // Displaying updated details of the first product after discount change
        product1.displayProductDetails();
    }
}
