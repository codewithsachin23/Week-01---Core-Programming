import java.util.Scanner;

public class TotalSumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0; // Initialize total to 0

        // Continuously ask user for input
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double number = input.nextDouble();
            if (number == 0) { // Break the loop if user enters 0
                break;
            }
            total += number; // Add user input to total
        }

        // Display the total sum
        System.out.println("Total sum: " + total);
        input.close();
    }
}
