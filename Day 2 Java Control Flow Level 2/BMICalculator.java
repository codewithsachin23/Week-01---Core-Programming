import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightInCm = input.nextDouble();

        // Convert height to meters
        double heightInMeter = heightInCm / 100.0;

        // Calculate BMI
        double bmi = weight / (heightInMeter * heightInMeter);

        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display results
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Your weight status is: " + status);
        input.close();
    }
}