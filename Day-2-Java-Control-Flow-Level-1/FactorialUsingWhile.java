
import java.util.Scanner;

// Program to calculate factorial using while loop
public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number >= 0) { // Check if the input is non-negative
            int factorial = 1, i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Display the factorial
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}


