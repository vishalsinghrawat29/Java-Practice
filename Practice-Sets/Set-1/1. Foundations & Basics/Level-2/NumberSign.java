
import java.util.Scanner;

public class NumberSign {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > 0) {
                System.out.println(num + " is a positive number");
            } else if (num < 0) {
                System.out.println(num + " is a negative number");
            } else {
                System.out.println("The number is zero");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}
