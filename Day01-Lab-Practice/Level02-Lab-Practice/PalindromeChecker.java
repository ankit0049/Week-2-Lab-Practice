package level2;
import java.util.Scanner;

// PalindromeChecker class implement the functionality to check if a string is a palindrome
public class PalindromeChecker
{
    // Attribute to store the text to be checked
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text)
    {   // Initializing the text
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome()
    {   // Reversing the text
        String reversed = new StringBuilder(text).reverse().toString();
        // Comparing the original and reversed text
        return text.equals(reversed);
    }

    // Method to display the result of palindrome check
    public void displayResult()
    {
        // Check if the text is a palindrome or not
        if (isPalindrome()) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter the text
        System.out.println("Enter text to check palindrome: ");
        String text = sc.nextLine();  // Taking text input

        // Creating a PalindromeChecker object with the provided text
        PalindromeChecker checker = new PalindromeChecker(text);

        // Displaying the result of palindrome check
        checker.displayResult();

        // Closing the Scanner object to prevent resource leak
        sc.close();
    }
}
