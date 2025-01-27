import java.util.Scanner;
import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int rounds = 3;
        int compScore = 0;
        int userScore = 0;

        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("                                        ");     
       
        for(int i = 1; i <= rounds; i++){
            int randomInt = random.nextInt(3) + 1;
            String compChoice = "";
            if(randomInt == 1){
                compChoice = "Rock";
            } else if(randomInt == 2) {
                compChoice = "Paper";
            } else if(randomInt == 3){
                compChoice = "Scissors";
            }

            System.out.println("                                        "); 
            System.out.println("Round: " + i);
            System.out.print("Please enter Rock, Paper, or Scissors: ");
            String userChoice = keyboard.nextLine().toUpperCase();
            System.out.println("Computer chose " + compChoice);

            if(compChoice.equalsIgnoreCase(userChoice)){
                System.out.println("It's a tie!");
            } else if((userChoice.equals("ROCK") && compChoice.equals("Scissors")) ||
                      (userChoice.equals("PAPER") && compChoice.equals("Rock")) ||
                      (userChoice.equals("SCISSORS") && compChoice.equals("Paper"))){
                System.out.println("You win this round!");
                userScore++;
            } else {
                System.out.println("Computer wins this round");
                compScore++;
            }
            System.out.println("                                        "); 

            if (i == rounds) {
                System.out.println("Final Scores: ");
            } else {
                System.out.println("Current Score: ");
            }
            System.out.println("User: " + userScore);
            System.out.println("Computer: " + compScore);
        }

        System.out.println("                                        "); 

        if(userScore > compScore){
            System.out.println("You win this game!");
        } else if(userScore == compScore){
            System.out.println("This game is a tie!");
        } else {
            System.out.println("You lose this game!");
        }

        keyboard.close();
    }
}