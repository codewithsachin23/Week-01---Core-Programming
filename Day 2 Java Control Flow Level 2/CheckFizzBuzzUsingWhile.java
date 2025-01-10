import java.util.Scanner;

public class CheckFizzBuzzUsingWhile {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number > 0) {
            int i = 1;  // Initialize the loop counter
            // Loop while i is less than or equal to the input number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if it is not divisible by 3 or 5
                else {
                    System.out.println(i);
                }
                i++;  // Increment the counter
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner
        input.close();
    }
}
