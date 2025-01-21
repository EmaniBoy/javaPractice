import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        ArrayList<Integer> numOfDice = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();


        System.out.print("how many dice? ");
        int dice = keyboard.nextInt();

        if(dice == 0){
            System.out.println("you have no dice to roll");

        } else {

            System.out.print("how many sides? ");
            int sides = keyboard.nextInt();


            for(int i = 0; i < dice; i++){
                int roll = random.nextInt(sides) + 1;
                numOfDice.add(roll);
            }
            System.out.println("your " + dice + " dice rolls are" + numOfDice);

            int total = 0;
            for(int i = 0; i < numOfDice.size(); i++){
                total += numOfDice.get(i);
            }
            System.out.println("Total: " + total);
        }


        System.out.println("Press Enter to return to the main menu.");
        keyboard.nextLine();  // Wait for the user to press Enter
        keyboard.nextLine();  // Consume the newline character
        
    }
}
