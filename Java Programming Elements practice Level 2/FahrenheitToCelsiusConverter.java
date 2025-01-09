// This program converts temperature from Fahrenheit to Celsius
// Importing the Scanner class to take user input
import java.util.Scanner;

public class FahrenheitToCelsiusConverter{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // message the user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");

        // Read the temperature in Fahrenheit from the user
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius using the formula (°F − 32) × 5/9.
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the converted temperature fahrenheit to Celsius
        System.out.println("The temperature " + fahrenheit + "°F is equal to " + celsius + "°C.");
    }
}
