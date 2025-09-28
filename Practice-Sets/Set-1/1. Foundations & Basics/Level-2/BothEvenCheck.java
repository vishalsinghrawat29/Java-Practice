
import java.util.Scanner;

public class BothEvenCheck {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            if (num1 % 2 == 0 && num2 % 2 == 0) {
                System.out.println("Both numbers are even.");
            } else {
                System.out.println("Both numbers are not even.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
