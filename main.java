import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // Initialize Scanner
        String userName = System.getProperty("user.name");
        System.out.println("Hello " + userName + "!");

        // Main loop
        while (true) {
            // Display menu
            System.out.println(" _____________________________________");
            System.out.println("|            MINI GAMES MENU          |");
            System.out.println("|-------------------------------------|");
            System.out.println("|    1. Calculator                    |");
            System.out.println("|    2. Random Number Guess           |");
            System.out.println("|    3. To-Do List                    |");
            System.out.println("|    4. Random Dice Roller            |");
            System.out.println("|    5. Bank Account Managment System |");
            System.out.println("|    6. Hangman                       |");
            System.out.println("|    7. Quiz Questions                |");
            System.out.println("|    8. Rock Paper Scissors           |");
            System.out.println("|    9. Tic Tac Toe                   |");
            System.out.println("|-------------------------------------|");
            System.out.println("|            PRESS 0 TO EXIT          |");
            System.out.println("|_____________________________________|");

            String option = keyboard.nextLine();

            switch (option) {
                case "1":
                    Calculator.main(new String[]{});
                    break;
                case "2":
                    RandNumGuess.main(new String[]{});
                    break;
                case "3":
                    Todo.main(new String[]{});
                    break;
                case "4":
                    Dice.main(new String[]{});
                    break;
                case "5":
                    BankMngmt.main(new String[]{});
                    break;
                case "6":
                    Hangman.main(new String[]{});
                    break;
                case "7":
                    Quiz.main(new String[]{});
                    break;
                case "8":
                    RPS.main(new String[]{});
                    break;
                case "9":
                    TicTacToe.main(new String[]{});
                    break;
                case "0":
                    System.out.println("Exiting program...");
                    keyboard.close(); // Close Scanner when exiting the program
                    return;  // Exit the program
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
