import java.util.Scanner;

public class GradeCalculator{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.println("Enter marks for Physics:");
        double physicsMarks = input.nextDouble();
        System.out.println("Enter marks for Chemistry:");
        double chemistryMarks = input.nextDouble();
        System.out.println("Enter marks for Maths:");
        double mathsMarks = input.nextDouble();

        // Calculate percentage
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;

        // Determine grade and remarks
        char grade;
        String remarks;

        if (percentage >= 80) {
            grade = 'A';
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = 'R';
            remarks = "(Remedial standards)";
        }

        // Output results
        System.out.println("Average Mark: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
