// This program check number is divisible of 5 or not?
// Importing the Scanner class to take user input
import java.util.Scanner;

public class CheckDivisibilityByFive{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of number  by user
        System.out.println("Enter the number: ");
        int number= input.nextInt();
		
		//check the divisibilty by 5 
		boolean isDivisible = (number%5 == 0);
		
		
		// Dispaly the output number divisible ?
        System.out.println("Is the number " + number +" divisible by 5? "+ isDivisible );

		//close the object we create
		input.close();
		}
		}