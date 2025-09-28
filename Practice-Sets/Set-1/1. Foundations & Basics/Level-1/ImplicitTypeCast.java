
import java.util.Scanner;

public class ImplicitTypeCast {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter an int type number: ");
            int intVar = sc.nextInt();

            // Implicit type casting (widening conversion): int to double
            double doubleVar = intVar;

            System.out.println("Converted into double: " + doubleVar);

        } catch (Exception e) {
            System.err.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
