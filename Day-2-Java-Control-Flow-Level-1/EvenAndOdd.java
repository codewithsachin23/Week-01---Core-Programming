import java.util.Scanner;

// Program to calculate factorial using for loop
public class EvenAndOdd{
    public static void main(String[] args) {
		
		//take input from the user
	Scanner input=new Scanner(String []args);
	int number=input.nextInt();
	//check for natural number
	     if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
	//staring loop from 1 to given number and print even and odd number
	for(int i=1;i<number;i++){
		
		if(i%2==0){
			System.out.println("The number" + i +" Even");
			
		}else{
			System.out.println("The number" + i +" Odd");
		}
	
	}
	
	}
}