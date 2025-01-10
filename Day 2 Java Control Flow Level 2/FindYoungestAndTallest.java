import java.util.*;

public class FindYoungestAndTallest{

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input age and height for Amar
        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = input.nextInt();

        // Input age and height for Akbar
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = input.nextInt();

        // Input age and height for Anthony
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = input.nextInt();

        // Find the youngest friend (smallest age)
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend (largest height)
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Output the youngest and tallest friends
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        // Close the scanner
        input.close();
    }
}
