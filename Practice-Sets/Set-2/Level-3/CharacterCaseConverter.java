
import java.util.Scanner;

public class CharacterCaseConverter {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a single character: ");
            char ch = sc.next().charAt(0);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
                System.out.println("Converted to lowercase: " + ch);
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // convert to uppercase using ASCII
                System.out.println("Converted to uppercase: " + ch);
            } else {
                System.out.println("Not an alphabet character!");
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
