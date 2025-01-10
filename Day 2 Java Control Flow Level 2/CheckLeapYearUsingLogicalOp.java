import java.util.Scanner;

public class CheckLeapYearUsingLogicalOp{

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the year from the user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is greater than or equal to 1582 and if it's a leap year
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("The year should be greater than or equal to 1582.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner
        input.close();
    }
}
