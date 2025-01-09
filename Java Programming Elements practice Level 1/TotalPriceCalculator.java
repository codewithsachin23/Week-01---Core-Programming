// This program is used to calculate unit price of an item and the quantity to be bought
// Importing the Scanner class to take user input
import java.util.Scanner; 

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the unit price of the item in INR
        System.out.print("Enter the unit price of the item (INR): ");
        int unitPrice = input.nextInt(); // Read the unit price from user input
        
        // Prompt the user to enter the quantity of items to be bought
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt(); // Read the quantity from user input
        
        // Calculate the total price by multiplying unit price by quantity
        int totalPrice = unitPrice * quantity;

        // Display the total purchase price based on the input unit price and quantity
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
