import java.util.*;

public class MaximumNumberOfHandshakes{
	
		//creating a method for calculating a simple inttrest
		public static int handshakes(int student){
			//calculating maximum Handshakes using formula (n * (n - 1)) / 2
			int maximumHandshakes=(student*(student-1))/2;
			//returing a maximum Handshakes 
			return maximumHandshakes;
			
		}
		
		
		
		public static void main(String[] args){
			//take a input from the user define a scanner class 
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the number of student: ");
			int student=input.nextInt();
	
			
			// calling static method without creating object and called directly and store a in variaable intrestAmount
			int maximumHandshakes=handshakes(student);
			
			//Dsiplay a result that return by the method
			System.out.println("The number of students " + student + " and maximum Handshakes  " + maximumHandshakes);
			
		}
}