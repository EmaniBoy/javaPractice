import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Hangman {
    public static void main(String[] args) {
        String words[] = {"programming", "arrays", "hangman", "science", "java", "computer"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        char[] hiddenWord = new char[word.length()];
        Arrays.fill(hiddenWord, '_');
        int incorrectGuesses = 0;
        Scanner keyboard = new Scanner(System.in);

        String[] hangmanArt = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
        };

        while(true){
            System.out.println(hangmanArt[incorrectGuesses]);
            System.out.println("Word: " + new String(hiddenWord));
            System.out.println("Guess a letter: ");
            char guess = keyboard.next().charAt(0);

            if (!Character.isLetter(guess)) {
                System.out.println("Please enter a valid letter.");
                continue;
            }


            boolean correctGuess = false;
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == guess){
                    hiddenWord[i] = guess;
                    correctGuess = true;
                }
            }

            if(!correctGuess){
                incorrectGuesses++;
            }


            if(new String(hiddenWord).equals(word)){
                System.out.println("congratulations, you guessed the word: " + word);
                break;
            }

            if (incorrectGuesses >= 6) {
                System.out.println(hangmanArt[incorrectGuesses]);
                System.out.println("You lost! The word was: " + word);
                break;
            }
        }
        System.out.println("Press Enter to return to the main menu.");
        keyboard.nextLine();  // Wait for the user to press Enter
        keyboard.nextLine();  // Consume the newline character

    }
}
