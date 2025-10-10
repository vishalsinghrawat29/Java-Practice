
import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            if (size < 2) {
                System.out.println("Please enter at least 2 numbers to analyze a pattern.");
                return;
            }

            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            System.out.print("\nOriginal: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.print("\nReversed: ");
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }

            System.out.print("\nDifferences: ");
            int[] diff = new int[size - 1];
            for (int i = 0; i < size - 1; i++) {
                diff[i] = arr[i + 1] - arr[i];
                System.out.print((diff[i] >= 0 ? "+" : "") + diff[i] + " ");
            }

            boolean increasing = true, decreasing = true;

            for (int i = 0; i < diff.length; i++) {
                if (diff[i] <= 0) {
                    increasing = false;
                }
                if (diff[i] >= 0) {
                    decreasing = false;
                }
            }

            String pattern;
            if (increasing) {
                pattern = "Strictly Increasing";
            } else if (decreasing) {
                pattern = "Strictly Decreasing";
            } else {
                pattern = "Mixed";
            }
            System.out.println("\nPattern: " + pattern);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers only.");
        }
    }
}
