
import java.util.Scanner;

public class SumUntilNegative {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;

            while (true) {
                System.out.print("Enter a number (negative to stop): ");
                int num = sc.nextInt();

                if (num < 0) {
                    break;
                }

                sum += num;

            }
            System.out.println("\nTotal Sum (excluding negative): " + sum);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
