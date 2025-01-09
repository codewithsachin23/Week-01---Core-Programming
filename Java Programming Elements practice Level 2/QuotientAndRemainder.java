// This program calculates the quotient and remainder of two numbers
// Importing the Scanner class to take user input
import java.util.Scanner;

public class QuotientAndRemainder{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // meassage the user to enter the first number (dividend)
        System.out.print("Enter the first number dividend: ");

        // Read the dividend from the user
        int dividend = input.nextInt();

        // meassage the user to enter the second number (divisor)
        System.out.print("Enter the second number divisor: ");

        // Read the divisor from the user
        int divisor = input.nextInt();

        // Calculate the quotient usign devide operator
        int quotient = dividend / divisor;

        // Calculate the remainder using the modulus operator
        int remainder = dividend % divisor;

        // Display output of the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder + 
                           " for the numbers " + dividend + " and " + divisor + ".");
    }
}
