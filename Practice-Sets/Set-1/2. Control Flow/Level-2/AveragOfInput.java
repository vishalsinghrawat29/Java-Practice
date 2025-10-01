
import java.util.Scanner;

public class AveragOfInput {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 5 numbers");
            int[] arr = new int[5];
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double average = sum / arr.length;
            System.out.println("Average of entered numbers: " + average);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid input.");
        }
    }
}
