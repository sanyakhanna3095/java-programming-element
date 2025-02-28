import java.util.Scanner;

public class MaxHandshake{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int maxHandshakes = (n * (n - 1)) / 2; // Calculate maximum possible handshakes

        System.out.printf("The maximum number of possible handshakes among %d students is %d.%n", n, maxHandshakes);

    }
}
