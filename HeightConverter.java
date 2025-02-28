import java.util.Scanner; 

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        float heightCm = sc.nextFloat();

        double totalInches = heightCm / 2.54; // Convert cm to inches
        int feet = (int) (totalInches / 12); // Get the feet part by dividing total inches by 12
        double inches = totalInches % 12; // Get the remaining inches

        System.out.printf("Your height in cm is %.2f, while in feet is %d and inches is %.2f.%n", heightCm, feet, inches);

    }
}

