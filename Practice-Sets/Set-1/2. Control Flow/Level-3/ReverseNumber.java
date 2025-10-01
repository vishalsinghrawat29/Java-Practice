
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int reverseNum = 0;
            while (num > 0) {
                reverseNum = reverseNum * 10 + num % 10;
                num /= 10;
            }
            System.out.println("Reverse number: " + reverseNum);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");

        }
    }
}
