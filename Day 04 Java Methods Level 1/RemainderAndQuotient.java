import java.util.*;

public class RemainderAndQuotient {

    // Method to find Remainder and Quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Check for divisor not being zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
			// calling methods 
            int[] result = findRemainderAndQuotient(number,divisor);
			// Display the Remainder And Quotient
			System.out.println("The reminder is: " + result[0] + "\nThe Quotient is: " + result[1]);
		}
		input.close();
		
	}
}