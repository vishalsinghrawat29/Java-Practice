
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("====== Welcome to the Number Guessing Game ======");
            Random rand = new Random();
            int totalScore = 0;

            // Level configurations: {maxNumber, maxAttempts, scorePerLevel}
            int[][] levels = {
                {20, 5, 10}, // Level 1
                {50, 7, 20}, // Level 2
                {100, 10, 30} // Level 3
            };

            for (int level = 0; level < levels.length; level++) {
                int maxNumber = levels[level][0];
                int maxAttempts = levels[level][1];
                int levelScore = levels[level][2];

                int targetNumber = rand.nextInt(maxNumber) + 1;
                int attemptsUsed = 0;
                boolean levelWon = false;

                System.out.println("\n--- Level " + (level + 1) + " ---");
                System.out.println("Guess the number between 1 and " + maxNumber);
                System.out.println("You have " + maxAttempts + " attempts.");

                while (attemptsUsed < maxAttempts) {
                    System.out.print("Enter your guess: ");
                    int guess = sc.nextInt();
                    attemptsUsed++;

                    if (guess == targetNumber) {
                        System.out.println("Congratulations! You guessed the number!");
                        levelWon = true;
                        totalScore += levelScore;
                        break;
                    } else if (guess < targetNumber) {
                        System.out.println("Too low!");
                    } else {
                        System.out.println("Too high!");
                    }
                    System.out.println("Attempts left: " + (maxAttempts - attemptsUsed));
                }

                if (!levelWon) {
                    System.out.println("You failed to guess the number. The correct number was " + targetNumber);
                }

                System.out.println("Level " + (level + 1) + " completed. Attempts used: " + attemptsUsed);
                System.out.println("Current Total Score: " + totalScore);

                if (!levelWon) {
                    System.out.println("Game Over!");
                    break;
                }

            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");

        }
    }
}
