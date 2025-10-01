
import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Grade (A,B,C,D,F) :");
            String grade = sc.nextLine().toUpperCase();
            switch (grade) {
                case "A":
                    System.out.println("Excellent");
                    break;
                case "B":
                    System.out.println("Good");
                    break;
                case "C":
                    System.out.println("Average");
                    break;
                case "D":
                    System.out.println("Poor");
                    break;
                case "F":
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Enter a valid grade (A-F).");
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid input.");
        }
    }
}
