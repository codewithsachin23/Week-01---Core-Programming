import java.util.*;
public class ChocolatesDistribution{

    // Method is a Chocolates Distribution N number of chocolates among M children
    public static int[] calculatesNumbers(int numberOfChocolates, int numberOfChilderns) {
        int totalChocolates= numberOfChocolates / numberOfChilderns;
        int remainingChocolates = numberOfChocolates % numberOfChilderns;
        return new int[]{totalChocolates,remainingChocolates};
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the numberof student: ");
        int numberOfChilderns= input.nextInt();

       // calling methods 
            int result[] = calculatesNumbers(numberOfChocolates,numberOfChilderns);
			// Display result
			System.out.println("The number of chocolates get is: " + result[0] + "\n number of chocolates remaining is: " + result[1]);
	
		input.close();
		
	}
}