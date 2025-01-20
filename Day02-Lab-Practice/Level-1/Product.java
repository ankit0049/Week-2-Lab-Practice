// Create a class Product and add the attributes productName, price and totalProducts
public class Product
{
    // Create a private Instance variable named as productName
    private String productName;

    // Create a private Instance variable named as price
    private double price;

    // Create a private static variable and shared among all objects
    private static int totalProducts = 0;

    // Constructor to initialize a product with name and price
    public Product(String productName, double price)
    {
        // Assigning parameter values to instance variables
        this.productName = productName;
        this.price = price;

        // Incrementing the totalProducts counter each time a product is created
        totalProducts++;
    }

    // Instance method to display details of a specific product
    public void displayProductDetails()
    {
        // Printing the name of the product
        System.out.println("Product Name: " + productName);

        // Printing the price of the product
        System.out.println("Price: $" + price);
    }

    // Static method to display the total number of products created
    public static void displayTotalProducts()
    {
        // Printing the total count of products created across all instances
        System.out.println("Total Products Created: " + totalProducts);
    }


    public static void main(String[] args)
    {
        // Creating the first product instance with name and price
        Product productOne = new Product("CG Product", 1200000.50);

        // Creating the second product instance with name and price
        Product productTwo = new Product("BridgeLab Product", 800000.75);

        // Printing a separator for readability
        System.out.println(" Displaying the Product 1 Details ");

        // Displaying details of the first product
        productOne.displayProductDetails();

        // Printing a separator for readability
        System.out.println(" Displaying the Product 2 Details ");

        // Displaying details of the second product
        productTwo.displayProductDetails();

        // Printing a separator for readability
        System.out.println(" Displaying Total Products ");

        // Displaying the total number of products created
        Product.displayTotalProducts();
    }
}
