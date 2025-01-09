// This program calculates Simple Interest based on Principal, Rate, and Time
// Importing the Scanner class to take user input
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // message the user to enter the Principal value
        System.out.print("Enter the Principal amount: ");
        
        // Read the Principal value from the user
        int principal = input.nextInt();

        // message the user to enter the Rate of Interest
        System.out.print("Enter the Rate of Interest: ");
        
        // Read the Rate of Interest from the user
        int rate = input.nextInt();

        // message the user to enter the Time in years
        System.out.print("Enter the Time in years: ");
        
        // Read the Time value from the user
        int time = input.nextInt();

        // Calculate Simple Interest using the formula: Simple Interest = Principal * Rate * Time / 100
        int simpleInterest = (principal * rate * time) / 100;

        // Display the Simple Interest along with the input values
        System.out.println("The Simple Interest is: " + simpleInterest +
                           " for Principal " + principal + ", Rate of Interest " + rate + 
                           " and Time " + time);
    }
}
