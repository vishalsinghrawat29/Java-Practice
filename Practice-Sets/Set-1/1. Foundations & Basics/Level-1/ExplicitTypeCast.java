
import java.util.Scanner;

public class ExplicitTypeCast {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a double type number: ");
            double doubleVar = sc.nextDouble();

            // Explicit type casting: converting double to int
            int intVar = (int) doubleVar;

            System.out.println("Converted into int: " + intVar);

        } catch (Exception e) {
            System.err.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
