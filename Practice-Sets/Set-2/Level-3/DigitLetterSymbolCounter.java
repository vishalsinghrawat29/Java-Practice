
import java.util.Scanner;

public class DigitLetterSymbolCounter {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String: ");
            String input = sc.nextLine();

            int letterCount = 0;
            int digitCount = 0;
            int symbolCount = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    letterCount++;
                } else if (ch >= '0' && ch <= '9') {
                    digitCount++;
                } else {
                    symbolCount++;
                }
            }

            System.out.println("\n--- Result ---");
            System.out.println("Letters: " + letterCount);
            System.out.println("Digits: " + digitCount);
            System.out.println("Special Symbols: " + symbolCount);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
