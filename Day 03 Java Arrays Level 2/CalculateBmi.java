 import java.util.Scanner;

public class CalculateBmi{
    public static void main(String args[]) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int noOfPerson = input.nextInt();

        // Initializing an array to store the weight of each person
        double weight[] = new double[noOfPerson];

        // Initializing an array to store the height of each person
        double height[] = new double[noOfPerson];

         // taking Input  from the user for  height of each person
        for (int i = 0; i < noOfPerson; i++) {
            System.out.print("Enter the height of person " + (i + 1) + " in meters: ");
            height[i] = input.nextDouble();
            System.out.println();
        }

        // taking Input  from the user for  weight of each person
        for (int i = 0; i < noOfPerson; i++) {
            System.out.print("Enter the weight of person " + (i + 1) + " in kilograms: ");
            weight[i] = input.nextDouble();
            System.out.println();
        }

        // Initializing an array to calculate and store the BMI of each person
        double bmi[] = new double[noOfPerson];

        // Calculate BMI for each person
        for (int i = 0; i < noOfPerson; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
        }

        // Initializing an array to store the weight status of each person
        String[] statuses = new String[noOfPerson];

        // Determining the weight status based on the BMI
        for (int i = 0; i < noOfPerson; i++) {
            if (bmi[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Printing the details of each person: weight, height, BMI, and weight status
        for (int i = 0; i < noOfPerson; i++) {
            System.out.println("Person Number: " + (i + 1));
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " m");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + statuses[i]);
            System.out.println();
        }
    }
}
