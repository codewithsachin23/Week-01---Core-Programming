//this program is calculate the Side OF The Square
// Importing the Scanner class from the java.util package to allow user input
import java.util.Scanner;

public class SideOFTheSquare {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();  // Read the perimeter of the square

        // Calculate the side length of the square by dividing the perimeter by 4
        double side = perimeter / 4;

        // Display the side length and the perimeter of the square
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
