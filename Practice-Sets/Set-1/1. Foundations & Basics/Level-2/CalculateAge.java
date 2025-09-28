
import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your birth year: ");
            int birthYear = sc.nextInt();
            int currentYear = 2025;

            if (birthYear > 0 && birthYear <= currentYear) {
                int age = currentYear - birthYear;
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Error: Birth year must be between 1 and " + currentYear);
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
