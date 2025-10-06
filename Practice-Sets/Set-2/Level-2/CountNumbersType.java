
import java.util.Scanner;

public class CountNumbersType {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many numbers do you want to enter? ");
            int n = sc.nextInt();  // number of inputs
            sc.nextLine();

            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            // take input n times
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                int num = sc.nextInt();

                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

            // display results
            System.out.println("\n--- Result ---");
            System.out.println("Positive Numbers: " + positiveCount);
            System.out.println("Negative Numbers: " + negativeCount);
            System.out.println("Zeroes: " + zeroCount);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");

        }
    }
}
