
import java.util.Scanner;

public class TempConvertor {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("-------------- Temperature Convertor --------------");
            System.out.print("Enter a temperature in Celsius: ");
            double celsius = sc.nextDouble();
            sc.nextLine();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Celsius: " + celsius + "°C");
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");
        }
    }
}
