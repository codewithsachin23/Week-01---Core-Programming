import java.util.*;

public class CheckPrimeNumber{

    public static void main(String[] args) {
	
        // Create an input object for user input
        Scanner input = new Scanner(System.in);
		
        // Input the number from the user
        int number = input.nextInt();
        boolean isPrime = true;
		
        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop through all numbers from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    // If the number is divisible by any number other than 1 and itself
                    isPrime = false;
                    break;  // No need to check further
                }
            }
        }
		
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner
        input.close();
    }
}
