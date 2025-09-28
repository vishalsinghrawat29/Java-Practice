
import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

            int difference = num1 - num2;
            System.out.println("Difference: " + difference);

            int product = num1 * num2;
            System.out.println("Product: " + product);

            int quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);

        } catch (Exception e) {
            System.err.println("Scanner failed: " + e.getMessage());
        }
    }
}
