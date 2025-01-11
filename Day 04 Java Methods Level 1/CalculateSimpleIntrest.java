import java.util.*;

public class CalculateSimpleIntrest{
	
		//creating a method for calculating a simple inttrest
		public static double simpleIntrest(double principle,double rateOfIntrest,double timeInYear){
			//calculating simple intrest using formula 
			double simpleIntrest=principle*rateOfIntrest*timeInYear/100;
			//returing a simpleIntrest 
			return simpleIntrest;
			
		}
		
		
		
		public static void main(String[] args){
			//take a input from the user define a scanner class 
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the principle amount: ");
			double principle=input.nextDouble();
			
			System.out.println("Enter the rate of intrest amount: ");
			double rateOfIntrest=input.nextDouble();
			
			System.out.println("Enter the time in year amount: ");
			double timeInYear=input.nextDouble();
			
			// calling static method without creating object and called directly and store a in variaable intrestAmount
			double intrestAmount=simpleIntrest(principle,rateOfIntrest,timeInYear);
			
			//Dsiplay a result that return by the method
			System.out.println("The Simple Interest is " + intrestAmount + " for Principal " + principle + ", Rate of Interest " +rateOfIntrest+  " and Time " + timeInYear);
			
		}
}