import java.util.Scanner;

public class CheckLeapYear{

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the year from the user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Ensure the year is greater than or equal to 1582 (Gregorian calendar)
        if (year >= 1582) {
            // Check if the year is divisible by 4 and not by 100, or divisible by 400
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The year should be greater than or equal to 1582.");
        }

        // Close the scanner
        input.close();
    }
}
