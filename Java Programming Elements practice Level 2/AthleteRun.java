// This program calculates the number of rounds an athlete must run to complete 5 km in a triangular park
// Importing the Scanner class to take user input
import java.util.Scanner;

public class AthleteRun{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length of the first side of the triangular park
        System.out.print("Enter the length of the first side of the triangular park (in meters): ");
        int side1 = input.nextInt();

        // Prompt the user to enter the length of the second side of the triangular park
        System.out.print("Enter the length of the second side of the triangular park (in meters): ");
        int side2 = input.nextInt();

        // Prompt the user to enter the length of the third side of the triangular park
        System.out.print("Enter the length of the third side of the triangular park (in meters): ");
        int side3 = input.nextInt();

        // Calculate the perimeter of the triangular park
        int perimeter = side1 + side2 + side3;

        // Convert 5 km to meters (1 km = 1000 meters)
        int totalDistance = 5 * 1000;

        // Calculate the number of rounds required
        int rounds = totalDistance / perimeter;

        // output the total number of rounds
       System.out.println("The total number of rounds the athlete will run is " +rounds+ " to complete 5 km");
    }
}
