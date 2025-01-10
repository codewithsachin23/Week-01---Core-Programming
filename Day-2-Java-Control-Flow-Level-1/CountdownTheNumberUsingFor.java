import java.util.Scanner;
// Program to perform a countdown using a for loop
public class CountdownTheNumberUsingFor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Get starting number for countdown
        System.out.print("Enter the starting number for the countdown: ");
        int counter = input.nextInt();

        // Perform countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Print rocket launch message
        System.out.println("Rocket Launched!");
        input.close();
    }
}
