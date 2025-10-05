
import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("------------------------- Leap Year Checker -------------------------");
            System.out.print("Enter a Year: ");
            int year = sc.nextInt();
            sc.nextLine();

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            System.out.println(year + (isLeapYear ? " is a Leap Year." : " is not a Leap Year."));
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");
        }
    }
}
