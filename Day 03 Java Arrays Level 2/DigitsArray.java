//importing the scanner class
import java.util.Arrays;
import java.util.Scanner;
public class DigitsArray{
   public static void main(String []args){
        // creating scanner class object for taking input
        Scanner input = new Scanner(System.in);  
		
		//taking the number from user to store its digit into array
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		
		//value of is a method which is used to convert number into string and length method is used to find length of string
		int numDigit= String.valueOf(number).length();
		
		int digitArr[]=new int[numDigit];
		
		int i=0;
		while(number>0){
			int digit = number%10;
			digitArr[i]=digit;
			
			number=number/10;
			i++;
		}
		int largestValue=Integer.MIN_VALUE;
		int secondLargestValue= Integer.MIN_VALUE;
		
		//running the loop for finding largest and second largest value from a array
		for(int j=0;j<numDigit;j++){
		    if(digitArr[j]>largestValue){
				secondLargestValue=largestValue;
				largestValue=digitArr[j];
				
			}
			else if(digitArr[j]>secondLargestValue && digitArr[j]!=largestValue){
				secondLargestValue=digitArr[j];
			}
		}
		//printing the result
		System.out.println("The largest digit from given number : "+largestValue+" and second largest value : "+secondLargestValue);
   }


}