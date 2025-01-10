
import java.util.*;

public class  CountTheNumberOfDigits{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Initialize the count variable
        int count = 0;
        
        // Handle negative numbers
        number = Math.abs(number);
        
        // Loop to count digits
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++;      // Increment the count
        }
        
        // Display the count
        System.out.println("The number of digits is: " + count);
        
        // Close the scanner
        input.close();
		}
		
		}