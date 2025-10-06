
import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the base number: ");
            int base = sc.nextInt();

            System.out.print("Enter the exponent: ");
            int exponent = sc.nextInt();

            int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }

            System.out.println(base + "^" + exponent + " = " + result);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
