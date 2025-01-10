
// Importing the Scanner class to take user input
import java.util.Scanner;

public class CheckAbundantNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number to check if it's an Abundant Number: ");
		
        // Read the number entered by the user
		int number = input.nextInt(); 
		 // Initialize sum to 0

        int sum = 0;

        // Calculate the sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor
                sum += i; // Add divisor to sum
            }
        }

        // Check if the number is Abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        input.close(); // Close the scanner
    }
}
