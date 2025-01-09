// This program swaps two numbers entered by the user using only two variables
// Importing the Scanner class to take user input
import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number : ");

        // Read the first number from the user
        int number1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number : ");

        // Read the second number from the user
        int number2 = input.nextInt();

        // Swap the numbers without using a thired variable 
        number1 = number1 + number2; // Step 1: Add the two numbers
        number2 = number1 - number2; // Step 2: Subtract number2 from the sum to get number1
        number1 = number1 - number2; // Step 3: Subtract the new number2 from the sum to get number2

        // Displaying a  the swepped numbers 
        System.out.println("The swapped numbers are " + number1 + " and " +number2);
    }
}
