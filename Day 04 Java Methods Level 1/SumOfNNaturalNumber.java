import java.util.*;

public class SumOfNNaturalNumber{
	
		//creating a method for  calculate Sum fo n natural number

	 public static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i; // Add each number to the sum
        }
        return sum;
    }
		
		public static void main(String[] args){
			//creating a object of class
			SumOfNNaturalNumber obj=new SumOfNNaturalNumber();
			
			//take a input from the user define a scanner class 
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter the postive number: ");
			int number=input.nextInt();

			
			// calling methods using objects
			int sum =obj.calculateSum(number);	
			System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
		}
}