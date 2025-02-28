import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        float base = sc.nextFloat();

        System.out.print("Enter the height of the triangle in cm: ");
        float height = sc.nextFloat();

        // Calculate area of the triangle in square centimeters
        double areaCm2 = 0.5 * base * height;

        // Convert area from square centimeters to square inches
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        // Display the results
        System.out.printf("The Area of the triangle in square inches is %.2f and in square centimeters is %.2f\n", areaIn2, areaCm2);

    }
}

