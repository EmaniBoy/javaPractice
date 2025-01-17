import java.util.Scanner;
import java.util.Random;

public class RandNumGuess{
    public static void main(String[] args){

        
        
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        Scanner keyboard = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100: ");

        while(guess != randomInt){
            System.out.println("enter your guess: ");
            guess = keyboard.nextInt();
            attempts++;

            if(guess > randomInt){
                System.out.println("your guess is too high");
            } else if(guess < randomInt){
                System.out.println("your guess is too low ");
            } else if(guess == randomInt){
                System.out.println("congrats, you guessed the number: " + guess + " in " + attempts + " attempts!");
            }

        }
        keyboard.close();

    }

}
