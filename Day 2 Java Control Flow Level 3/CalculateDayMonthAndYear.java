// Importing the Scanner class to take user input
import java.util.Scanner;

public class CalculateDayMonthAndYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Day of the Week Calculation
		 // Read month
        System.out.print("Enter month (1-12): ");
		int month = input.nextInt();
		
        // Read day		
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt(); 
		// Read year
        System.out.print("Enter year: ");
        int year = input.nextInt(); 

        int y0 = year - (14 - month) / 12; // Adjust year
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // Calculate x
        int m0 = month + 12 * ((14 - month) / 12) - 2; // Adjust month
        int d0 = (day + x + (31 * m0) / 12) % 7; // Calculate day of week

        System.out.println("The day of the week is: " + d0);
	}
}