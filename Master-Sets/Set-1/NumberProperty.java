
import java.util.Scanner;

public class NumberProperty {

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            boolean palindrome = isPalindrome(number);
            boolean prime = isPrime(number);
            int sumDigits = sumOfDigits(number);
            int reversed = reverseNumber(number);

            // Print summary
            System.out.println("\n----- Number Analysis -----");
            System.out.println("Number: " + number);
            System.out.println("Palindrome: " + (palindrome ? "Yes" : "No"));
            System.out.println("Prime: " + (prime ? "Yes" : "No"));
            System.out.println("Sum of digits: " + sumDigits);
            System.out.println("Reversed number: " + reversed);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");
        }
    }
}
