// This program converts weight from pounds to kilograms
// Importing the Scanner class to take user input
import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // message the user to enter the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        
        // Read the weight in pounds from the user
        double weightInPounds = input.nextDouble();

        // Conversion 1 pound = 2.2 kg
        double weightInKg = weightInPounds * 2.2;

        // Display the weight in pounds and the equivalent weight in kilograms
        System.out.println("The weight of the person in pounds is: " + weightInPounds +
                           " and in kilograms is: " + weightInKg);
    }
}
