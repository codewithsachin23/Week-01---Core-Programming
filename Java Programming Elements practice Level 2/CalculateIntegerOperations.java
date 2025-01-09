// This program performs integer operations to demonstrate operator precedence
// Importing the Scanner class to take user input
import java.util.Scanner;

public class CalculateIntegerOperations{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the value of 'a'
        System.out.print("Enter value for 'a': ");

        // Read the value of 'a' from the user
        int a = input.nextInt();

        // Prompt the user to enter the value of 'b'
        System.out.print("Enter value for 'b': ");

        // Read the value of 'b' from the user
        int b = input.nextInt();

        // Prompt the user to enter the value of 'c'
        System.out.print("Enter value for 'c': ");

        // Read the value of 'c' from the user
        int c = input.nextInt();

        // Perform the first operation (a + b * c)
        int result1 = a + b * c; // Multiplication has higher precedence than addition

        // Perform the second operation (a * b + c)
        int result2 = a * b + c; // Multiplication evaluated first, then addition

        // Perform the third operation (c + a / b)
        int result3 = c + a / b; // Division has higher precedence than addition

        // Perform the fourth operation (a % b + c)
        int result4 = a % b + c; // Modulus evaluated first, then addition

        // Display the results of the operations
        System.out.println("The results of integer operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
