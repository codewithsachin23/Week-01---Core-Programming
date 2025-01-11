import java.util.*;

public class CalculateWindChill{

    // Method to find WindChill
    public double calculateWindChill(double temperature, double windSpeed) {
		return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);   
    }

    public static void main(String[] args) {
		CalculateWindChill obj=new CalculateWindChill();
        // Taking input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in fahrenheit <=50 : ");
        double temperature = input.nextDouble();

        System.out.print("Enter the  wind speed miles per hour: 3>= ");
        double  windSpeed = input.nextDouble();

        	// calling methods 
            double result =obj.calculateWindChill(temperature,windSpeed);
			// Display the WindChill
			System.out.println("The WindChill " +result);
		
		input.close();
		
	}
}