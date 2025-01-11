import java.util.Scanner; 

public class TwoDimentionalToSingleDimentional{
	public static void  main(String []args){
		Scanner input=new Scanner(System.in); 
		//Enter no of rows
		System.out.print("please enter the number of row in your 2D array: "); 
		int numberOfRows= input.nextInt(); 
		//Enter column
		System.out.print("please enter the number of column in your 2D array: "); 
		int numberOfColumn= input.nextInt(); 
		
		int matrix[][]= new int[numberOfRows][numberOfColumn]; 
		System.out.println("please enter the value of matrix ");
		//adding value in the 2D matrix 
		for(int i=0;i<numberOfRows;i++){
			for(int j=0;j<numberOfColumn;j++){
				matrix[i][j]=input.nextInt(); 
			}
		}
		
		//Declaring a single dimentional array of size rows*col 
		int oneDArray[] = new int[numberOfRows*numberOfColumn];
		int index=0;
		//coping the value 2D to 1D array 
		for(int i=0;i<numberOfRows;i++){
			for(int j=0;j<numberOfColumn;j++){
				oneDArray[index++]=matrix[i][j];
			}
		} 
		
		
		//Displaying the result
		for(int i=0;i<index;i++){
			System.out.print(oneDArray[i]+" ");
		}
	}
}