
import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("-------------- Simple Interest Calculator --------------");
            System.out.print("Enter a Principal Amount: ");
            double principal = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter a Intertest Rate: ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter a Time in years: ");
            double time = sc.nextDouble();
            sc.nextLine();

            double simpleInterest = (principal * rate * time) / 100;

            System.out.printf("Simple Interest for %.2f amount with %.2f%% interest rate in %.2f years will be %.2f.%n", principal, rate, time, simpleInterest);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");

        }
    }
}
