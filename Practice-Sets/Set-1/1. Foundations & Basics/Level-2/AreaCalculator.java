
import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose a shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    calculateCircleArea(sc);
                case 2 ->
                    calculateRectangleArea(sc);
                case 3 ->
                    calculateTriangleArea(sc);
                default ->
                    System.out.println("Error: Please choose a valid option (1, 2, or 3).");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");

        }
    }

    // Method to calculate area of a circle
    private static void calculateCircleArea(Scanner sc) {
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle with radius %.2f is %.2f%n", radius, area);
    }

    // Method to calculate area of a rectangle
    private static void calculateRectangleArea(Scanner sc) {
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.printf("Area of Rectangle with length %.2f and breadth %.2f is %.2f%n", length, breadth, area);
    }

    // Method to calculate area of a triangle
    private static void calculateTriangleArea(Scanner sc) {
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.printf("Area of Triangle with base %.2f and height %.2f is %.2f%n", base, height, area);
    }
}
