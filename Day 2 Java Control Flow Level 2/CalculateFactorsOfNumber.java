import java.util.Scanner;

public class CalculateFactorsOfNumber{

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop from 1 to number-1 (as per the given hint)
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }

        // Close the scanner
        input.close();
    }
}
