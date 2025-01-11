import java.util.*;

public class MaximumNumberOfHandshakes2{
	
		//creating a method for calculating a simple inttrest
		public static void handshakes(int student){
			//calculating maximum Handshakes using formula (n * (n - 1)) / 2
			int maximumHandshakes=(student*(student-1))/2;
			
			//Dsiplay a result 
			System.out.println("The number of students " + student + " and maximum Handshakes  " + maximumHandshakes);
			
		}
		
		
		
		public static void main(String[] args){
			//take a input from the user define a scanner class 
			MaximumNumberOfHandshakes2 obj=new MaximumNumberOfHandshakes2();
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the number of student: ");
			int student=input.nextInt();
	
			
			// calling methods using objects
			obj.handshakes(student);
			
			
			
			
		}
}