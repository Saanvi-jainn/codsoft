import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have generated a random number between 1 and 100.");
            System.out.println("You have 10 attempts to guess the number.");

            while (numberOfAttempts < 10 && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess == numberToGuess) {
                    hasGuessedCorrectly = true;
                    score++;
                    System.out.println("Congratulations! You guessed the correct number in " + numberOfAttempts + " attempts.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("You've used all 10 attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String userResponse = scanner.next();
            playAgain = userResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Your final score is: " + score);
        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}
