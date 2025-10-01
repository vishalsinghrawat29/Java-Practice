
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.print("Enter first Number: ");
                int num1 = sc.nextInt();

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = sc.next().charAt(0);

                System.out.print("Enter second Number: ");
                int num2 = sc.nextInt();

                double result;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println(num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator! Please use +, -, * or /.");
                }

                System.out.print("Do you want to perform another calculation? (yes/no): ");
                String choice = sc.next().toLowerCase();

                if (choice.equals("no")) {
                    System.out.println("Exiting... Thank you!");
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");
        }
    }
}
