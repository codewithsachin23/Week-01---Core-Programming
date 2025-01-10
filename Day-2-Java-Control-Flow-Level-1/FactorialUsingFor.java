import java.util.Scanner;

// Program to calculate factorial using for loop
public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number >= 0) { // Check if the input is non-negative
            int factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the factorial
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}