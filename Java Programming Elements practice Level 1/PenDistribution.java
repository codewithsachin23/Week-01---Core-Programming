// This program calculates the distribution of pens among students and finds the remaining pens
public class PenDistribution {
    public static void main(String[] args) {
        // Declare and initialize the total number of pens and students
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate the number of pens each student gets
        int pensPerStudent = totalPens / totalStudents;

        // Calculate the remaining pens that cannot be distributed evenly
        int remainingPens = totalPens % totalStudents;

        // Display the result: number of pens each student gets and the remaining pens
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
