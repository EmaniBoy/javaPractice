import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {

        String userName = System.getProperty("user.name");
        System.out.println("Hello " + userName);

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(3) + 1;
        int userChoice = 0;
        
        System.out.println("welcome to rock paper scissors");
        System.out.println("Type 1 for rock, 2 for paper, 3 for scissors");
        userChoice = keyboard.nextInt();

        if(userChoice == 1 && randomInt == 1){
            System.out.println("i choose rock");
            System.out.println("its a tie");
        } else if(userChoice == 1 && randomInt == 2){
            System.out.println("i choose paper");
            System.out.println("you lose");
        }else if(userChoice == 1 && randomInt == 3){
            System.out.println("i choose scissors");
            System.out.println("you win");
        }else if(userChoice == 2 && randomInt == 1){
            System.out.println("i choose rock");
            System.out.println("you win");
        }else if(userChoice == 2 && randomInt == 2){
            System.out.println("i choose paper");
            System.out.println("its a tie");
        }else if(userChoice == 2 && randomInt == 3){
            System.out.println("i choose scissors");
            System.out.println("you win");
        }else if(userChoice == 3 && randomInt == 1){
            System.out.println("i choose rock");
            System.out.println("you lose");
        }else if(userChoice == 3 && randomInt == 2){
            System.out.println("i choose paper");
            System.out.println("you win");
        }else if(userChoice == 3 && randomInt == 3){
            System.out.println("i choose scissors");
            System.out.println("its a tie");
        }
        
        System.out.println("Press Enter to return to the main menu.");
        keyboard.nextLine();  // Wait for the user to press Enter
        keyboard.nextLine();  // Consume the newline character

    }
}
