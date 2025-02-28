import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the unit price of the item (INR): ");
        float unitPrice = sc.nextFloat();
        System.out.print("Enter the quantity of the item: ");
        int quantity = sc.nextInt();

        // Calculate the total purchase price
        float totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f.%n", totalPrice, quantity, unitPrice);

    }
}

