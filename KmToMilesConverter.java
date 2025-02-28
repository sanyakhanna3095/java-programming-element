import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        float km = sc.nextFloat();

        double miles = km / 1.6; // Convert kilometers to miles using the formula

        System.out.printf("The total miles is %.2f miles for the given %.2f km.%n", miles, km);

    }
}

