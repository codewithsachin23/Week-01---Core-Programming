import java.util.*;

public class CheckSpringSeason{
	
		//creating a method for  Checking  Spring Season

		public static boolean isSpringSeason(int month,int day){
		
			if((month==3 && day >=20) || ( month==4) || (month == 5) || (month<=6 && day<=20)){
				return true;
			
			}else {
			    return false;	
			}
}
		
		public static void main(String[] args){
			//creating a object of class
			CheckSpringSeason obj=new CheckSpringSeason();
			
			//take a input from the user define a scanner class 
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter the Month(1-12): ");
			int month=input.nextInt();

			System.out.println("Enter the Day (1-31): ");
			int day=input.nextInt();
			
			// calling methods using objects
			boolean isSpringSeason =obj.isSpringSeason(month,day);	
			if(isSpringSeason){
				System.out.println("Its a Spring Season");
				
			}else{
				 System.out.println("Not a Spring Season");
			}
			
		}
}