import java.util.Scanner;

public class CalculateMultiples{

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop backward from 100 to 1
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }

        // Close the scanner
        input.close();
    }
}
