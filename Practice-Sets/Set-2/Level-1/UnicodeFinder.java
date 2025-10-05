
import java.util.Scanner;

public class UnicodeFinder {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Ask user to enter a character
            System.out.print("Enter a single character: ");
            char ch = sc.next().charAt(0);

            // Convert character to its Unicode (ASCII) value
            int unicode = (int) ch;

            // Display result
            System.out.println("The Unicode (ASCII) value of '" + ch + "' : " + unicode);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");
        }
    }
}
