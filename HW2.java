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
        for(int i = 1; i <= rounds; i++){
            int randomInt = random.nextInt(3) + 1;
            String compChoice = "";
            if(randomInt == 1){
                compChoice = "ROCK";
            } else if(randomInt == 2) {
                compChoice = "PAPER";
            } else if(randomInt == 3){
                compChoice = "SCISSORS";
            }

            System.out.println("round: " + i);
            System.out.println("Please enter Rock, Paper, or Scissors: ");
            String userChoice = keyboard.nextLine().toUpperCase();
            System.out.println("your choice is: " + userChoice);
            System.out.println("Computer chose " + compChoice);

            if(compChoice.equals(userChoice)){
                System.out.println("Its a tie!");
            } else if(userChoice.equals("ROCK") && compChoice.equals("SCISSOTS") ||
                        (userChoice.equals("PAPER") && compChoice.equals("ROCK")) ||
                        (userChoice.equals("SCISSORS") && compChoice.equals("PAPER"))){
                            System.out.println("You win this round!");
                            userScore++;
            } else {
                System.out.println("Computer wins this round");
                compScore++;
            }
        }
        System.out.println("Final Scores: ");
        System.out.println("You: " + userScore);
        System.out.println("Compute: " + compScore);

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
