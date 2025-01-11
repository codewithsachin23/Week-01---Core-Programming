import java.util.*;

public class SmallestAndLargest{
	
	//creating a method for find Smallest And Largest

	 public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }
		
		public static void main(String[] args){
			//take a input using user define a scanner class 
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter the 3 numbers: ");
			int number1 = input.nextInt();
			int number2 = input.nextInt();
			int number3 = input.nextInt();
			
			// calling methods 
            int[] result = findSmallestAndLargest(number1, number2, number3);
			 // Display the smallest and largest numbers
			System.out.println("The smallest number is: " + result[0] + "\nThe largest number is: " + result[1]);
			input.close();
		}
}