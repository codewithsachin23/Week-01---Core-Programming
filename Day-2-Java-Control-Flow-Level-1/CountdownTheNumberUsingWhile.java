import java.util.Scanner;

// Program to perform a countdown using a while loop
public class CountdownTheNumberUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get starting number for countdown
        System.out.print("Enter the starting number for the countdown: ");
        int counter = input.nextInt();

        // Perform countdown until 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement counter
        }

        // Print rocket launch message
        System.out.println("Rocket Launched!");
        input.close();
    }
}
