import java.util.Scanner;
public class AllFactorOfNumber{
	public static void main(String []args){
		//Declarinng scanner class
		Scanner input=new Scanner(System.in); 
		
		System.out.print("Enter number whose facters yuo want to find: ");
		//Input from user
		
		int number=input.nextInt(); 
		
		//Declaring initial array of size 10 to sotre factors
		
		int factors[]=new int[10]; 
		// for storing element and tracking factor array
		int index=0;
		int maxFactor=10;
		for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
                if (index == maxFactor) {
					//Resizing factor size
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor];
					//Storing into temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
				//Storing factor
                factors[index++] = i; 
            }
        }
		//Display the all factor
		System.out.print("Factors of the number " +number + " are ");
		for(int i=0;i<index;i++){
			System.out.print(factors[i]+" ");
		}
  		
		
	}
}