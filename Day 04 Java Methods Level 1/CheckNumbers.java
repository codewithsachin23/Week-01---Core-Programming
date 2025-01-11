import java.util.*;

public class CheckNumbers{
	
		//creating a method for numbers Checking positive, negative, or zero.

		public static int numbersChecking(int number){
		
			if(number<0){
				return -1;
			
			}else if(number>0){
				return 1;
			}else{
				return 0;
			}
}
		
		public static void main(String[] args){
			//creating a object of class
			CheckNumbers obj=new CheckNumbers();
			
			//take a input from the user define a scanner class 
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int number=input.nextInt();
	
			
			// calling methods using objects
			int result=obj.numbersChecking(number);
			
			//Dsiplay a result 
			System.out.println(result);
			
			
			
			
		}
}