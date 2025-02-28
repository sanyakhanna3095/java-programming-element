import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        // Check if number2 is not zero before performing division to avoid division by zero error
        double division = (number2 != 0) ? number1 / number2 : Double.NaN;

        // Display the results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
                number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication +
                ", and " + ((number2 != 0) ? division : "undefined (division by zero)") + ".");

        // Close the scanner object
        input.close();
    }
}

