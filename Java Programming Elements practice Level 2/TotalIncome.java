// This program calculate a total income of person
// Importing the Scanner class to take user input
import java.util.Scanner; 

public class TotalIncome{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the salary
        System.out.print("Enter your salary INR: ");
        int salary = input.nextInt(); // Read the salary input

        // Prompt the user to enter the bonus
        System.out.print("Enter your bonus INR: ");
        int bonus = input.nextInt(); // Read the bonus input

        // Calculate the total income by adding salary and bonus
        int totalIncome = salary + bonus;

        // Display the salary, bonus, and total income
        System.out.println("The salary is INR " + salary + 
                           " and the bonus is INR " + bonus + 
                           ". Hence, Total Income is INR " + totalIncome);
    }
}
