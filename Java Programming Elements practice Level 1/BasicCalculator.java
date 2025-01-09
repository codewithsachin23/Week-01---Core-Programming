// This program is calculator and use for basic calculation
// Importing the Scanner class from the java.util package to allow user input
import java.util.Scanner;

public class BasicCalculator{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();  // Read the first number

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();  // Read the second number
        
        // Perform addition, subtraction, multiplication, and division on the two numbers
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the results of the  All operations given by two numbers
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
