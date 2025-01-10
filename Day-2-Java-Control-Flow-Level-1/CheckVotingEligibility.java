// This program check Voting Eligibility
// Importing the Scanner class to take user input
import java.util.Scanner;

public class CheckVotingEligibility{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of age  by user
        System.out.println("Enter the age is: ");
        int age= input.nextInt();
		
		//checking the age is greter then equals to 18 then they can vote or not
		// displaying a result for given age
		
		if(age>= 18){
		   
		System.out.println("The person's age is " + age + " and can vote."  );
		
		}else{
		
		
         System.out.println(" The person's age is " +age + " and cannot vote."  );
		}

		//close the object we create
		input.close();
		}
		}