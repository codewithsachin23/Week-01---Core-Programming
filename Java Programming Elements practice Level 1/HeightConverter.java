// This program use for HeightConverter 
// Importing the Scanner class to take user input
import java.util.Scanner; 

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        
        // Read the height in centimeters from the user
        int heightInCM = input.nextInt();

        // Convert height from centimeters to inches (1 inch = 2.54 cm)
        double heightInInches = heightInCM / 2.54;

        // Convert height from centimeters to feet (1 foot = 12 inches = 12 * 2.54 cm)
        double heightInFeet = heightInCM / (12 * 2.54);

        // Display the height in centimeters, feet, and inches
        System.out.println("Your height in cm is " + heightInCM + 
                           ", in feet is " + heightInFeet + 
                           ", and in inches is " + heightInInches);
    }
}
