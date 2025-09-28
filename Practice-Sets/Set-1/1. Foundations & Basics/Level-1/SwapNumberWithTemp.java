
import java.util.Scanner;

public class SwapNumberWithTemp {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number (num1): ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number (num2): ");
            int num2 = sc.nextInt();

            System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

            // Swapping using a temporary variable
            int temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
