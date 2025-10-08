
import java.util.Scanner;

public class HCFCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int hcf = 1;
            int min = (num1 < num2) ? num1 : num2;

            // Correct range: include min
            for (int i = 1; i <= min; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    hcf = i;
                }
            }

            System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + hcf);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        }
    }
}
