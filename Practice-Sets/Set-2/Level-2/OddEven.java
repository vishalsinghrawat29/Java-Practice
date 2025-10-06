
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a Number (n): ");
            int n = sc.nextInt();   // user input
            sc.nextLine();

            // -------------------------
            // Printing Odd Numbers using for loop
            // -------------------------
            System.out.println("Odd Numbers between 1 and " + n + ":");
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {           // condition for odd number
                    System.out.print(i + " ");
                }
            }

            System.out.println("\n"); // new line for clarity

            // -------------------------
            // Printing Even Numbers using while loop
            // -------------------------
            System.out.println("Even Numbers between 1 and " + n + ":");
            int i = 1;
            while (i <= n) {
                if (i % 2 == 0) {           // condition for even number
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println("\n");

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
