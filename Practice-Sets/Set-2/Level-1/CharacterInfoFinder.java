
import java.util.Scanner;

public class CharacterInfoFinder {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Ask user for a single character
            System.out.print("Enter a single character: ");
            char ch = sc.next().charAt(0); // Read first character of input

            // Check and display the type of character
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch + " is a Letter.");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println(ch + " is a Digit.");
            } else {
                System.out.println(ch + " is a Special Character.");
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");
        }
    }
}
