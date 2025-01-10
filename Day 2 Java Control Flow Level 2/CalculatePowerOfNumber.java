import java.util.Scanner;

public class CalculatePowerOfNumber{

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number and the power
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Variable to store the result, initially set to 1
        int result = 1;

        // Loop from i = 1 to i <= power
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply the result by the number in each iteration
        }

        // Output the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner
        input.close();
    }
}
