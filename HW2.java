import java.util.Scanner;
import java.util.Random;

//Karthik Emani 1325-005

public class HW2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int rounds = 3; 
        boolean playAgain = true; 

        System.out.println("Welcome to the Rock, Paper, Scissors game!");
        System.out.println("__________________________________________");

        while (playAgain) {
            int compScore = 0; // Computer's total score
            int userScore = 0; // User's total score

            for (int i = 1; i <= rounds; i++) {
                int randomInt = random.nextInt(3) + 1; // get random choice for the computer
                String compChoice = ""; 
                if (randomInt == 1) {
                    compChoice = "Rock";
                } else if (randomInt == 2) {
                    compChoice = "Paper";
                } else if (randomInt == 3) {
                    compChoice = "Scissors";
                }

                System.out.println("\nRound: " + i);
                System.out.print("Please enter Rock, Paper, or Scissors: ");
                String userChoice = keyboard.nextLine().toUpperCase(); 

                // Determine if the input is valid
                if (!userChoice.equals("ROCK") && !userChoice.equals("PAPER") && !userChoice.equals("SCISSORS")) {
                    System.out.println("Invalid input! The computer automatically wins this round.");
                    compScore++; 
                } else {
                    System.out.println("Computer chose: " + compChoice);

                    // Determine the winner of the round
                    if (compChoice.equalsIgnoreCase(userChoice)) {
                        System.out.println("It's a tie!");
                    } else if ((userChoice.equals("ROCK") && compChoice.equals("Scissors")) ||
                               (userChoice.equals("PAPER") && compChoice.equals("Rock")) ||
                               (userChoice.equals("SCISSORS") && compChoice.equals("Paper"))) {
                        System.out.println("You win this round!");
                        userScore++; // Increment user score for a win
                    } else {
                        System.out.println("Computer wins this round.");
                        compScore++; // Increment computer score for a win
                    }
                }

                // Display current scores
                if (i == rounds) {
                    System.out.println("\nFinal Scores:");
                } else {
                    System.out.println("\nCurrent Scores:");
                }
                System.out.println("User: " + userScore);
                System.out.println("Computer: " + compScore);
            }

            // Display final score results & determine overall winner
            System.out.println("\nGame Results:");
            if (userScore > compScore) {
                System.out.println("Congratulations, you are the overall winner!");
            } else if (userScore == compScore) {
                System.out.println("This game is a tie!");
            } else {
                System.out.println("You lose this game!");
            }

            // Ask if the user wants to play again
            System.out.print("Would you like to play again (yes/no): ");
            String response = keyboard.nextLine().toLowerCase(); 
            if (!response.equals("yes")) {
                playAgain = false; // Exit the loop if the user does not want to play again
                System.out.println("Thank you for playing!");
            }
        }

        keyboard.close(); // Close the scanner to free resources
    }
}
