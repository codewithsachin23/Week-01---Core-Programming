// Importing the Scanner class to take user input
import java.util.Scanner;

public class CalculatorUsingSwitch{

    public static void main(String[] args) {
	
	  // Create a input object for user input
        Scanner input = new Scanner(System.in);
	 System.out.print("Enter first number: ");
        double first = input.nextDouble(); 
        System.out.print("Enter second number: ");
        double second = input.nextDouble(); 
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next(); 

        // Perform calculation based on operator
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        input.close(); // Close the scanner to free resources
    }
}