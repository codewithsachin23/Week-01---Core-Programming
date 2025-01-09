// This is used to calculate a number of handsakes
//Importing the Scanner class to take user input
import java.util.Scanner; 

public class MaximumNumberOfHandshakes {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        
        // Read the number of students from the user input
        int numberOfStudents = input.nextInt();
        
        // Calculate the maximum number of handshakes using the formula: 
        // (n * (n - 1)) / 2, where n is the number of students
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the maximum number of handshakes for the given number of students
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);
    }
}
