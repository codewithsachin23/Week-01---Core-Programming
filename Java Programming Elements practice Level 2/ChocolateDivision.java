// This program divides N chocolates among M children and calculates the remainder
// Importing the Scanner class to take user input
import java.util.Scanner;

public class ChocolateDivision{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // message the user to enter the total number of chocolates
        System.out.print("Enter the total number of chocolates: ");
        
        // Read the total number of chocolates from the user
        int numberOfChocolates = input.nextInt();

        // message the user to enter the number of children
        System.out.print("Enter the number of children: ");
        
        // Read the number of children from the user
        int numberOfChildren = input.nextInt();

        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.println("The number of chocolates each child gets is: " + chocolatesPerChild + ".\nThe number of remaining chocolates are: " + remainingChocolates);
        
    }
}
