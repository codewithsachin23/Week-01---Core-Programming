// This program calculates and displays the average percentage marks of a student in PCM (Physics, Chemistry, and Math)
public class AveragePCMMarks {
    public static void main(String[] args) {
        // Declear and Initialize the student name
        String studentName = "Sam's";

        // Declear and Initialize the marks in Math, Physics, and Chemistry
        int markInMath = 94, markInPhysics = 95, markInChemistry = 96;

        // Declear and Initialize the maximum mark possible per subject
        int maxMarkPerSubject = 100;

        // Calculate the average percentage marks across all three subjects
        // The division by 3.0 ensures the result is a double and not an integer
        double averagePercentageMark = (markInMath + markInPhysics + markInChemistry) / 3.0;

        // Display the student name and their average percentage marks in pcm
        System.out.println(studentName + " average mark in PCM is " + averagePercentageMark + "%");
    }
}
