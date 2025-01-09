// This program is used to calculate Distance Converter Feet Yards And Miles
// Importing the Scanner class to read user input
import java.util.Scanner;

public class DistanceConverterFeetYardsAndMiles {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        
        // Read the input distance in feet as a double
        double distanceInFeet = input.nextDouble();
        
        // Convert the distance from feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3.0;
        
        // Convert the distance from yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760.0;
        
        // Display the input distance in feet, along with the calculated distances in yards and miles
        System.out.println("The distance in feet is: " + distanceInFeet +
                           " The distance in yards is: " + distanceInYards + 
                           " The distance in miles is: " + distanceInMiles);
    }
}
