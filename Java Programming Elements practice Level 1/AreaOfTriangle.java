//This is use to calculate Area Of Triangle 
// Importing the Scanner class from the java.util package to allow user input
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle in centimeters
        System.out.print("Enter the base of triangle in cm: ");
        int base = input.nextInt();  // Read the base of the triangle

        // Prompt the user to enter the height of the triangle in centimeters
        System.out.print("Enter the height of triangle in cm: ");
        int height = input.nextInt();  // Read the height of the triangle
        
        // Calculate the area of the triangle using the formula: (1/2 * base * height)
        float areaOfTriangle = 0.5f * base * height;

        // Convert the area from square centimeters to square inches
        // (1 inch = 2.54 cm, so the conversion factor is 2.54 * 2.54)
        float areaInSqInches = areaOfTriangle / (2.54f * 2.54f);

        // Display the area of the triangle in both square centimeters and square inches
        System.out.println("Area of the Triangle in square centimeters is " + areaOfTriangle + 
                           " and in square inches is " + areaInSqInches);
    }
}
