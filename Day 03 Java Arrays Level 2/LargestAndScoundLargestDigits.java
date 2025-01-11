import java.util.Scanner;

public class LargestAndScoundLargestDigits {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define array to store the digits of the number
        int maxDigit = 10; // Maximum number of digits allowed
        int[] digits = new int[maxDigit];
        int index = 0; // To track the current index of the array

        // Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Maximum digit limit reached, remaining digits are ignored.");
                break;
            }
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++; // Increment the index
        }

        // Variables to store the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest != 0 ? secondLargest : "No second largest digit found"));

        // Close the scanner
        input.close();
    }
}
