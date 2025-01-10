// Program to find the sum of numbers until the user enters 0 or a negative number
import java.util.Scanner;
public class TotalSumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0; // Initialize total to 0

        // Infinite loop to continuously take input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0) { // Break the loop if user enters 0 or negative number
                break;
            }
            total += num; // Add user input to total
        }

        // Display the total sum
        System.out.println("Total sum: " + total);
    }
}