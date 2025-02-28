public class VolumeOfEarth {

    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double radiusKm = 6378.0;

        // Conversion factor: 1 km = 0.621371 miles
        double kmToMiles = 0.621371;

        // Calculate the volume of the Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert the radius to miles
        double radiusMiles = radiusKm * kmToMiles;

        // Calculate the volume of the Earth in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of the Earth in cubic kilometers is %.2f km^3\n", volumeKm3);
        System.out.printf("The volume of the Earth in cubic miles is %.2f mi^3\n", volumeMiles3);
    }
} 

