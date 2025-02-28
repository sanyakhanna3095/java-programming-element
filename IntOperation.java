import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Perform the integer operations while understanding operator precedence
        int result1 = a + b * c; // Multiplication (*) takes precedence over addition (+)
        int result2 = a * b + c; // Multiplication (*) takes precedence over addition (+)
        int result3 = c + a / b; // Division (/) takes precedence over addition (+)
        int result4 = a % b + c; // Modulus (%) takes precedence over addition (+)

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
    }
}


