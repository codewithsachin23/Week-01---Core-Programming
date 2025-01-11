import java.util.*;

public class AthleteRuns{
	
		//creating a method for calculating a calculating Rounds
		public static void calculatingRounds(double side1,double side2,double side3,int distanceInMeter){
			
			//calculating totalRounds using formula 
			double perimeter=side1+side2+side3;
			int totalRounds= distanceInMeter/(int)perimeter;
			
			
			//Dsiplay a result 
			System.out.println("The athlete runs 5 km and number of rounds needs to complete is " + totalRounds);
			
		}
		
		
		
		public static void main(String[] args){
			//take a input from the user define a scanner class 
			AthleteRuns obj=new AthleteRuns();
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the side 1 in meters: ");
			double side1=input.nextDouble();
			System.out.println("Enter the side 2 in meters: ");
			double side2=input.nextDouble();
			System.out.println("Enter the side 3 in meters: ");
			double side3=input.nextDouble();
			//converting 5km in meter 1km=1000m
			int distanceInMeter=5*1000;
	
			
			// calling methods using objects
			obj.calculatingRounds(side1,side2,side3,distanceInMeter);
			
			
			
			
		}
}