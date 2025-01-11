import java.util.Scanner;

public class NumberAnalysis{

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define an array to store numbers
        int[] numbers = new int[5];

        // Prompt the user to enter the numbers
        System.out.println("Enter the 5 numbers:");

        // Loop to take input in array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
			}
		// Loop to analyze each number iteratively	
        for (int i=0;i<numbers.length;i++) {
           if (numbers[i] > 0) {
                if(numbers[i]%2==0){
				System.out.println("The Number "+ numbers[i]+" Even");
				}else{
				System.out.println("The Number "+ numbers[i]+" Odd");
				}
            }else if(numbers[i]<0){ 
				System.out.println("The Number "+ numbers[i]+" is Nagative");
			}else{
			    System.out.println("The Number is  Zero ");
			}	        
        }
		// Compare the first and last elements iteratively
		if(numbers[0]<numbers[numbers.length-1]){
				System.out.println("The first number (" + numbers[0] + ") is less than the last number (" + numbers[numbers.length-1] + ").");
		}else if(numbers[0]>numbers[numbers.length-1]){ 
            System.out.println("The first number (" + numbers[0] + ") is greater than the last number (" + numbers[numbers.length-1] + ").");
		}else{
            System.out.println("The first number (" + numbers[0] + ") is equal to the last number (" + numbers[numbers.length-1] + ").");
			}

        // Close the scanner
        input.close();
    }
}
