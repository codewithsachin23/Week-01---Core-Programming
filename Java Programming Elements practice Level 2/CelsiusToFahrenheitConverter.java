// This program converts temperature from Fahrenheit to Celsius
// Importing the Scanner class to take user input
import java.util.Scanner;

public class CelsiusToFahrenheitConverter{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
		double celsius=input.nextDouble();


        // Convert  Celsius to Fahrenheit using the formula (°C × 9/5) + 32.
        double fahrenheit =  (celsius*9/5)+32;

        // Display  the converted temperature  Celsius to fahrenheit
        System.out.println("The " + celsius + " celsius is " + fahrenheit + "fahrenheit");

    }
}
