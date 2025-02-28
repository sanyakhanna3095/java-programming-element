import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        float baseCm = sc.nextFloat();

        System.out.print("Enter the height of the triangle in cm: ");
        float heightCm = sc.nextFloat();

        double areaCm2 = 0.5 * baseCm * heightCm; // Calculate area in square centimeters
        double areaIn2 = areaCm2 / 6.4516; // Convert area to square inches (1 square inch = 6.4516 square cm)

        System.out.printf("The area of the triangle is %.2f square cm and %.2f square inches.%n", areaCm2, areaIn2);

    }
}

