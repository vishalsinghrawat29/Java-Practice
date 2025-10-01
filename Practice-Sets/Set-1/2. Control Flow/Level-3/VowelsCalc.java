
import java.util.Scanner;

public class VowelsCalc {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            int vowelsCount = 0;
            int consonantsCount = 0;

            sentence = sentence.toLowerCase();

            // loop through each character
            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);

                // Check if the character is a letter
                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelsCount++;
                    } else {
                        consonantsCount++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowelsCount);
            System.out.println("Number of consonants: " + consonantsCount);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid sentence.");
        }
    }
}
