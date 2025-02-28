import java.util.Scanner;

public class BasicCalculatorFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float number1 = sc.nextFloat(); 

        System.out.print("Enter the second number: ");
        float number2 = sc.nextFloat();

        double sum = number1 + number2; // Perform addition
        double difference = number1 - number2; // Perform subtraction
        double product = number1 * number2; // Perform multiplication
        double quotient = number2 != 0 ? number1 / number2 : Double.POSITIVE_INFINITY; // Perform division with zero check

        System.out.printf("The addition, subtraction, multiplication, and division of the numbers %.2f and %.2f are %.2f, %.2f, %.2f, and %.2f.%n",
                number1, number2, sum, difference, product, quotient);

    }
}

