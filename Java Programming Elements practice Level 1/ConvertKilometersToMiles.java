// This program converts a distance in kilometers to miles
public class ConvertKilometersToMiles {
    public static void main(String[] args) {
        // Initialize the distance in kilometers
        double distanceInKilometers = 10.8;

        // Conversion factor: 1 kilometer equals 0.621371 miles
        double miles = distanceInKilometers * 0.621371;

        // Display the converted distance in miles
        System.out.println("The distance " + distanceInKilometers + "km in miles is " + miles);
    }
}
