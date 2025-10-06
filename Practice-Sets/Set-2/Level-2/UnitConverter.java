
import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("----- Unit Converter -----");
            System.out.println("1. Km to Miles");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Grams to Kilograms");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter distance in kilometers: ");
                    double km = sc.nextDouble();
                    double miles = km * 0.621371; // 1 km = 0.621371 miles
                    System.out.println(km + " Km = " + miles + " Miles");
                    break;
                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = sc.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + "°C = " + fahrenheit + "°F");
                    break;
                case 3:
                    System.out.print("Enter weight in grams: ");
                    double grams = sc.nextDouble();
                    double kilograms = grams / 1000;
                    System.out.println(grams + " g = " + kilograms + " kg");
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select from 1 to 4.");

            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");

        }
    }
}
