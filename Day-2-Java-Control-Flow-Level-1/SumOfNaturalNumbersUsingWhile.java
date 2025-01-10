import java.util.Scanner;

// Program to calculate the sum of N natural numbers using while loop
public class SumOfNaturalNumbersUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the value of N from user
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) { // Check if the input is a natural number
            int totalWhile = 0, i = 1;

            // Calculate sum using while loop
            while (i <= n) {
                totalWhile += i;
                i++;
            }

            // Calculate sum using formula
            int totalFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using while loop: " + totalWhile);
            System.out.println("Sum using formula: " + totalFormula);
        } else {
            System.out.println("Please enter a natural number.");
        }
    }
}