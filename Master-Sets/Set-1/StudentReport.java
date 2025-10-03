
import java.util.Scanner;

public class StudentReport {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int noOfSubject = 5;

            // 1. Ask for number of students
            System.out.print("Enter number of students: ");
            int noOfStudent = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            // Arrays to store details
            String[] names = new String[noOfStudent];
            int[][] marks = new int[noOfStudent][noOfSubject];
            int[] totals = new int[noOfStudent];
            double[] averages = new double[noOfStudent];
            char[] grades = new char[noOfStudent];

            int topperIndex = 0;

            // 2. Input details for each student
            for (int i = 0; i < noOfStudent; i++) {
                System.out.println("\nEnter details for Student " + (i + 1));

                // Name
                System.out.print("Name: ");
                names[i] = sc.nextLine();

                // Marks in subjects
                totals[i] = 0;
                for (int j = 0; j < noOfSubject; j++) {
                    System.out.print("Marks in subject " + (j + 1) + ": ");
                    marks[i][j] = sc.nextInt();
                    totals[i] += marks[i][j];
                }
                sc.nextLine(); // consume newline

                // Average
                averages[i] = totals[i] / (double) noOfSubject;

                // Grade
                if (averages[i] >= 90) {
                    grades[i] = 'A';
                } else if (averages[i] >= 80) {
                    grades[i] = 'B';
                } else if (averages[i] >= 70) {
                    grades[i] = 'C';
                } else if (averages[i] >= 60) {
                    grades[i] = 'D';
                } else {
                    grades[i] = 'F';
                }

                // Check if topper
                if (totals[i] > totals[topperIndex]) {
                    topperIndex = i;
                }
            }

            // 3. Print Report
            System.out.println("\n===== Student Report =====");
            for (int i = 0; i < noOfStudent; i++) {
                System.out.println("Name: " + names[i]);
                System.out.println("Total: " + totals[i]);
                System.out.printf("Average: %.2f%n", averages[i]); // formatted to 2 decimals
                System.out.println("Grade: " + grades[i]);
                System.out.println("--------------------------");
            }

            // 4. Topper
            System.out.println("🏆 Top Scorer: " + names[topperIndex] + " with " + totals[topperIndex] + " marks.");

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");
        }
    }
}
