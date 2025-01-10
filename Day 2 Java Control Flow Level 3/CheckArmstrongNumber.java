// Java program to check if a number is Armstrong
import java.util.Scanner;

public class CheckArmstrongNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Check if a number is Armstrong
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = input.nextInt(); 
        int originalNumber = number; // Store the original number for comparison
        int sum = 0; // Initialize sum to 0

        // Loop to calculate the sum of cubes of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += Math.pow(digit, 3); // Add the cube of the digit to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the number is equal to the sum of cubes
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
}
}