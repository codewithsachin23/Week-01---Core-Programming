import java.util.Scanner;

// Program to calculate bonus based on years of service
public class EmployeeBonusCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = input.nextInt();

        double bonusAmount = 0.0; // Declare bonusAmount outside the if block

        // Check if years of service are greater than 5
        if (yearsOfService > 5) {
            bonusAmount = salary * 0.05; // Calculate 5% of the salary
        }

        // Display the bonus amount
        System.out.println("The bonus amount is: " + bonusAmount);

        input.close();
    }
}
