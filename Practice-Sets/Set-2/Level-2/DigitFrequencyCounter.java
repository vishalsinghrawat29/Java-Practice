
import java.util.Scanner;

public class DigitFrequencyCounter {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();    // input number

            System.out.print("Enter a Digit to Count (0-9): ");
            int digitToFind = sc.nextInt();   // digit to search for

            int originalNum = num;    // store original number
            int count = 0;            // counter for occurrences

            while (num != 0) {
                int digit = num % 10;
                if (digit == digitToFind) {
                    count++;
                }
                num = num / 10;
            }

            System.out.println("Digit " + digitToFind + " appears " + count
                    + " time(s) in " + originalNum + ".");

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");

        }
    }
}
