
import java.util.Scanner;

public class NumberPatternTriangle {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }

    }
}
