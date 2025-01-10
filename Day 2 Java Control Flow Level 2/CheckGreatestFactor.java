import java.util.Scanner;

public class CheckGreatestFactor{

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store the greatest factor, initially set to 1
        int greatestFactor = 1;

        // Loop from number-1 to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                
	          greatestFactor = i;
              break; // Break the loop once we find the greatest factor
            }
        }

        // Output the greatest factor (besides the number itself)
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        // Close the scanner
        input.close();
    }
}
