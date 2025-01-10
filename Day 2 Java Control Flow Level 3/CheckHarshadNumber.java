 
 // Importing the Scanner class to take user input
import java.util.Scanner;

public class CheckHarshadNumber{

    public static void main(String[] args) {
	
	  // Create a input object for user input
        Scanner input = new Scanner(System.in);
         System.out.print("Enter a number to check if it's a Harshad number: ");
         int number = input.nextInt(); 
       int  originalNumber = number; // Store the original number
        int sum = 0; // Initialize sum to 0

        // Loop to calculate the sum of digits
        while (originalNumber != 0) {
            sum += originalNumber % 10; // Add the last digit to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
   }
}