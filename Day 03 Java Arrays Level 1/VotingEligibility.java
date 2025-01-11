import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define an array to store ages of students
        int[] ages = new int[10];

        // Prompt the user to enter the ages of students
        System.out.println("Enter the ages of 10 students:");

        // Loop to take input and validate each age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Check for invalid age
            if (ages[i] < 0) {
                System.out.println("Invalid age. Please enter a non-negative number.");
                i--; // Retry the same index
            }
        }

        // Loop to check voting eligibility
        System.out.println("\nVoting Eligibility Results:");
        for (int age : ages) {
            if (age < 18) {
                System.out.println("The student with the age " + age + " cannot vote.");
            } else {
                System.out.println("The student with the age " + age + " can vote.");
            }
        }

        // Close the scanner
        input.close();
    }
}
