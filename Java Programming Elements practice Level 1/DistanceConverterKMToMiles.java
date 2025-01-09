//This program use to convert km to miles
// Importing the Scanner class from the java.util package to allow user input
import java.util.Scanner;

public class DistanceConverterKMToMiles {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // message the user to enter the distance in kilometers
        System.out.print("Enter the distance in KM: ");
        
        // Read the user input for distance in kilometers
        double distanceInkilometers = input.nextDouble();
        
        // Convert the distance from kilometers to miles using the conversion factor (1 km = 0.621371 miles)
        double distanceInMiles = distanceInkilometers * 0.621371;

        // distplay the Output to converted distance in km to miles
        System.out.println("The total miles is " + distanceInMiles + " mile for the given " + distanceInkilometers + " km");
    }
}
