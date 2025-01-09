// This program calculates the discount on student fees and the final fee after applying the discount
// Importing the Scanner class from the java.util package to allow user input
import java.util.Scanner;

public class UniversityFeeDiscountCalculator {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the student fee
        System.out.print("Enter Your fees: ");
        int studentFee = input.nextInt();  // Read the student fee

        // Prompt the user to enter the discount percentage
        System.out.print("Enter Your discount percentage: ");
        int discountPercent = input.nextInt();  // Read the discount percentage
        
        // Calculate the discount amount by multiplying the student fee by the discount percentage
        // Then, divide by 100 to get the actual discount value
        int discountAmount = (studentFee * discountPercent) / 100;

        // Calculate the final fee after subtracting the discount amount from the original fee
        int finalFee = studentFee - discountAmount;

        // Display the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
