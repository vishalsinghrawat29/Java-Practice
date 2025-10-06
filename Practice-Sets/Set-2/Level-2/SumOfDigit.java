
import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            sc.nextLine();

            int originalNum = num;
            int sum = 0;

            while (num != 0) {
                int digit = num % 10; // extract last digit
                sum += digit;         // add it to sum
                num = num / 10;       // remove last digit
            }

            System.out.println("Sum of digits of " + originalNum + " : " + sum);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
