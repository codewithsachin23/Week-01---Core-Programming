import java.util.Scanner;
public class CheckFizzBuzzInArr {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner  input = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a positive integer: ");
        int number =  input.nextInt();
		//Array to storing results
		String []results=new String[number+1]; 
		
		int index=0;
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer."); 
			System.exit(0);
        } 
            // Loop from 1 to the number
            for (int i = 0; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0 ) {
                    results[index++]="FizzBuzz";
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                   results[index++]="Fizz";
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    results[index++]="Buzz";
                }
                // Otherwise, print the number itself
                else {
                    results[index++]=Integer.toString(i);
                }
            }
        //Display the result
		for(int i=0;i<index;i++){
			System.out.print("Position " + i + " = " + results[i] + " , ");
		}
    }
}
