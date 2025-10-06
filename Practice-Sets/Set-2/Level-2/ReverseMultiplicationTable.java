
import java.util.Scanner;

public class ReverseMultiplicationTable {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();   // take user input
            sc.nextLine();

            for (int i = 10; i > 0; i--) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            System.out.println("Multiplication Table of " + num + " in Reverse Order:");

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");

        }
    }
}
