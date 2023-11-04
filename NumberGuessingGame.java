import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the World Of Number Guessing Game!");
        System.out.println("You have " + maxAttempts + " attempts to guess the number between " + minRange + " and " + maxRange);

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("\nRound " + (rounds + 1));
            System.out.println("New game! Try to guess the number.");

            while (attempts < maxAttempts) {
                System.out.print("Enter the guessed number: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < minRange || userGuess > maxRange) {
                    System.out.println("Your guess is out of the range.");
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1;
                    break;
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you're attempt was get completed. The correct number was: " + targetNumber);
                }
            }

            System.out.println("Your current score: " + score);
            rounds++;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your final score: " + score);
                break;
            }
        } while (true);

        scanner.close();
    }
}
