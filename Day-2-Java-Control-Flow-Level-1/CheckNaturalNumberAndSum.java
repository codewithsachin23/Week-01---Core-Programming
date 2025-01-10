// This program check Natural Number And digit Sum of given number
// Importing the Scanner class to take user input
import java.util.Scanner;

public class CheckNaturalNumberAndSum{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of natural number  by user
        System.out.println("Enter the natural number: ");
        int number= input.nextInt();
		  
		  //check if the number is a natural number is +ve number
		   if(number>= 0){
		   
		   //calculate the sum the sum of n natural number
		   int sum = number*(number+1)/2;
		   
		   // Display a result if number is natural number
		System.out.println(" The sum of " + sum +  "  natural number is " + number );
		
		}else{
		
		//display result if number is not natural number
         System.out.println("The number  " + number + "is not  a natural."  );
		}

		//close the object we create
		input.close();
		}
		}