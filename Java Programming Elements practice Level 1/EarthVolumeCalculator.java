// This program calculates the volume of Earth in both cubic kilometers and cubic miles
import java.util.*;

public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Initialize the radius of Earth in kilometers
        double radiusOfEarthInKM = 6378;

        // Calculate the volume of Earth in cubic kilometers using the formula for the volume of a sphere:
        // (4/3) * π * r^3
        double volumeOfEarthInKM = (4.0 / 3.0) * Math.PI * Math.pow(radiusOfEarthInKM, 3);

        // Convert the radius from kilometers to miles (1 km = 0.621371 miles)
        double radiusOfEarthInMiles = radiusOfEarthInKM * 0.621371;

        // Calculate the volume of Earth in cubic miles using the same formula with the converted radius
        double volumeOfEarthInMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusOfEarthInMiles, 3);

        // Display the calculated volume of Earth in both cubic kilometers and cubic miles
        System.out.println("The volume of Earth in cubic kilometers is " + volumeOfEarthInKM + 
                           " and in cubic miles is " + volumeOfEarthInMiles);
    }
}
