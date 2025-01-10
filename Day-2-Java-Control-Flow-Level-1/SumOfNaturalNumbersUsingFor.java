// Program to calculate the sum of N natural numbers using for loop
import java.util.Scanner;
public class SumOfNaturalNumbersUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the value of N from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) { // Check if the input is a natural number
            int totalUsingFor = 0;

            // Calculate sum using for loop
            for (int i = 1; i <= n; i++) {
                totalUsingFor += i;
            }

            // Calculate sum using formula
            int totalUsingFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using for loop: " + totalUsingFor);
            System.out.println("Sum using formula: " + totalUsingFormula);
        } else {
            System.out.println("Please enter a natural number.");
        }
    }
}