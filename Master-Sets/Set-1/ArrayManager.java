
import java.util.Scanner;

public class ArrayManager {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array: ");
            int arrSize = sc.nextInt();

            int[] arr = new int[arrSize];
            int[] reverseArr = new int[arrSize];

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            int noOfOdd = 0;
            int noOfEven = 0;

            // Input array and compute simultaneously
            for (int i = 0; i < arrSize; i++) {
                System.out.print("Enter element at index " + i + ": ");
                arr[i] = sc.nextInt();

                // Fill reverse array in correct position
                reverseArr[arrSize - 1 - i] = arr[i];

                // Sum
                sum += arr[i];

                // Max & Min
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }

                // Even & Odd
                if (arr[i] % 2 == 0) {
                    noOfEven++;
                } else {
                    noOfOdd++;
                }
            }

            double average = sum / (double) arrSize;

            // Print results
            System.out.println("\n===== Array Analysis =====");
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
            System.out.println("Sum: " + sum);
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Even Count: " + noOfEven);
            System.out.println("Odd Count: " + noOfOdd);

            // Print reversed array
            System.out.print("Reversed Array: [ ");
            for (int i = 0; i < reverseArr.length; i++) {
                System.out.print(reverseArr[i]);
                if (i < reverseArr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ]");

            // Search for a number
            System.out.print("\nEnter a number to search: ");
            int search = sc.nextInt();
            boolean found = false;
            for (int element : arr) {
                if (element == search) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(search + " exists in the array ✅");
            } else {
                System.out.println(search + " does NOT exist in the array ❌");
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");
        }
    }
}
