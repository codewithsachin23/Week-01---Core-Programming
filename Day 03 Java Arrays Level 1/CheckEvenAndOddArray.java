import java.util.Scanner; 
public class CheckEvenAndOddArray{
	public static void main(String []args){
		//Creating Scanner class 
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the number till you want even or odd number: "); 
		
		//Taking input from user  
		int number=input.nextInt(); 
		
		if(number<=0){ 
			System.out.println("Enter any natural number"); 
			System.exit(0);
		}
		
		int size = number / 2 + 1;

        int[] evenNumbers = new int[size];
        int[] oddNumbers = new int[size];

        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        } 
		
		//print odd number
		System.out.print("Odd numbers are till "+ number +" is " );
		
		for(int i=0;i<oddIndex;i++){
			System.out.print(oddNumbers[i]+" ");
		}
		
		System.out.println();
		
		//printing even number
		
		System.out.print("Odd numbers are till "+ number +" is " );
		for(int i=0;i<evenIndex;i++){
			System.out.print(evenNumbers[i]+" ");
		}
		
	}
}