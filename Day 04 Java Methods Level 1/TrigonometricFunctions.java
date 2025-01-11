import java.util.*;

public class TrigonometricFunctions{

    // Method to find WindChill
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);  
		
		 return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
		TrigonometricFunctions obj=new TrigonometricFunctions();
        // Taking input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the angle in degree : ");
        double angle = input.nextDouble();

 

        	// calling methods 
            double results[] =obj.calculateTrigonometricFunctions(angle);
			// Display the WindChill
			System.out.println("The Sine of " +angle+ " degrees: "+results[0]+" .\nCosine of " +angle+ " degrees "+results[1]+" .\nTangent of" +angle+ " degrees " +results[2]);
		
		input.close();
		
	}
}