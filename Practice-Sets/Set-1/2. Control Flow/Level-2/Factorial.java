
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid input.");
        }
    }
}
