
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();
            int numberToGuess = random.nextInt(50) + 1; // Random number between 1 and 50
            int userGuess = 0;
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between 1 and 50. Try to guess it.");

            // Loop until user guesses correctly
            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                if (sc.hasNextInt()) {
                    userGuess = sc.nextInt();
                    attempts++;
                    if (userGuess < 1 || userGuess > 50) {
                        System.out.println("Please guess a number between 1 and 50.");
                    } else if (userGuess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > numberToGuess) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid input.");

        }
    }
}
