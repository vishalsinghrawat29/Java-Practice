
import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("----------- Area Calculator -----------");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            double area = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of Circle: ");
                    double radius = sc.nextDouble();
                    area = 3.14159 * radius * radius;
                    System.out.println("Area of Circle = " + area);
                    break;

                case 2:
                    System.out.print("Enter length of Rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width of Rectangle: ");
                    double width = sc.nextDouble();
                    area = length * width;
                    System.out.println("Area of Rectangle = " + area);
                    break;

                case 3:
                    System.out.print("Enter base of Triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height of Triangle: ");
                    double height = sc.nextDouble();
                    area = 0.5 * base * height;
                    System.out.println("Area of Triangle = " + area);
                    break;

                case 4:
                    System.out.println("Exiting program... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Please select between 1–4.");
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers only.");
        }
    }
}
