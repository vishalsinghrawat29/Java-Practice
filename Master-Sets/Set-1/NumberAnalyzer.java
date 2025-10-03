
import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();

            int totalDivisibleByThree = 0;
            int totalDivisibleByFive = 0;
            int totalDivisibleByBoth = 0;

            System.out.println("-------------------------");
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " : ");

                if (i % 3 == 0 && i % 5 == 0) {
                    totalDivisibleByBoth++;
                    totalDivisibleByThree++;
                    totalDivisibleByFive++;
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    totalDivisibleByThree++;
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    totalDivisibleByFive++;
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

            System.out.println("-------------------------");
            System.out.println("Total No. Divisible by 3: " + totalDivisibleByThree);
            System.out.println("Total No. Divisible by 5: " + totalDivisibleByFive);
            System.out.println("Total No. Divisible by both 3 & 5: " + totalDivisibleByBoth);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");
        }
    }
}
