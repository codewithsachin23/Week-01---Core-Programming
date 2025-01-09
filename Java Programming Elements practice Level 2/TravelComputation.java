// This program computes the total distance and travel time for a journey with user inputs
// Importing the Scanner class to take user input
import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Prompt the user to enter the starting city
        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        // Prompt the user to enter the via city 
        System.out.print("Enter the via city (viaCity): ");
        String viaCity = input.nextLine();

        // Prompt the user to enter the destination city 
        System.out.print("Enter the destination city : ");
        String toCity = input.nextLine();

        // Prompt the user to enter the distance from fromCity to viaCity in KM
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in KM: ");
        double distanceFromToVia = input.nextDouble();

        // Prompt the user to enter the time taken from fromCity to viaCity in minutes
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();

        // Prompt the user to enter the distance from viaCity to toCity in km
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " KM: ");
        double distanceViaToFinalCity = input.nextDouble();

        // Prompt the user to enter the time taken from viaCity to toCity in minutes
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        // Compute the total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Compute the total time
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // displaying the travel details
        System.out.println("The total distance travelled by " + name + " from " + fromCity +
                           " to " + toCity + " via " + viaCity + " is " + totalDistance + 
                           " km and the total time taken is " + totalTime + " minutes.");
    }
}
