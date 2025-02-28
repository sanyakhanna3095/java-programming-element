import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Performing operations while following operator precedence
        double result1 = a + b * c; // Multiplication has higher precedence than addition
        double result2 = a * b + c; // Multiplication before addition
        double result3 = c + a / b; // Division before addition
        double result4 = a % b + c; // Modulus before addition


        System.out.println("The results of Double Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}

