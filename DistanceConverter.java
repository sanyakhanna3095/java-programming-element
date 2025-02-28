import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = sc.nextFloat();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3.0;

        // Convert feet to miles
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f.%n", 
                          distanceInYards, distanceInMiles);

    }
}

