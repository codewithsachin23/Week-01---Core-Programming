import java.util.Scanner;

public class CreateMultiplicationTable{
	public static void main(String []args){
		//Defining Scanner class
		Scanner sc=new Scanner(System.in); 
		
		//Getting number input from user to make multiplication table 6 to 9
		System.out.print("Enter no. who's multiplication table you want: "); 
		int number= sc.nextInt(); 
		
		//Creating array of size 10 for storing it's table value
		int resultTable[] =new int[4]; 
		
		//storing it's table value in array 
		for(int i=6;i<=9;i++){
			resultTable[i-6]=number*i;
		}
		
		//printing the resultant multiplication table of a number 
		System.out.println("Table of a number " +number +" from 6 to 9 is ");
		for(int i=6;i<=9;i++){
			System.out.println(number +" * " + i +" = " + resultTable[i-6]);
		}
	}
}