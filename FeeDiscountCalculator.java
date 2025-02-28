import java.util.Scanner;
public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total student fee (INR): ");
        double fee = sc.nextDouble();
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discount = (fee * discountPercent) / 100; // Calculate the discount amount
        double finalFee = fee - discount; // Calculate the final fee after discount

        System.out.printf("The discount amount is INR %.2f and the final discounted fee is INR %.2f.%n", discount, finalFee);

    }
}

