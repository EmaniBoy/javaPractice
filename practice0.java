
import java.util.Scanner;
import java.util.Random;

/*
 * ITSS / OPRE 3311 - Introduction to Programming
 * Project: FlashCards – Project 2
 * Programmer: Sumayyah Hasan
 * Date: February 14, 2025
 */

public class practice0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Variables declaration
        String name = "", playAgain = "Y", problemType;
        int lowRange, highRange, numProblems;
        int correctAnswers = 0;

        // Display intro message
        System.out.println("Welcome to the FlashCard system!");

        while (playAgain.equalsIgnoreCase("Y")) {
            // Input name
            System.out.print("Please enter your name, one word only: ");
            name = input.nextLine();
            System.out.println("Hi, " + name + ". Welcome!");

            // Prompt for problem type
            System.out.println("Select the type of problems you wish to work on:");
            System.out.print("Enter 'A' for addition, 'S' for subtraction, 'M' for multiplication, 'D' for division: ");
            problemType = input.next().toUpperCase();

            // Prompt for range of values
            System.out.println("Enter the range of values for the problems:");
            System.out.print("Enter the lowest value for the problem numbers: ");
            lowRange = input.nextInt();
            
            System.out.print("Enter the highest value for the problem numbers: ");
            highRange = input.nextInt();

            // Prompt for number of problems
            System.out.print("Enter the number of problems you wish to work: ");
            numProblems = input.nextInt();

            for (int i = 0; i < numProblems; i++) {
                int firstNum = random.nextInt(highRange - lowRange + 1) + lowRange;
                int secondNum = random.nextInt(highRange - lowRange + 1) + lowRange;
                int userAnswer, correctAnswer = 0;

                // Generate and evaluate problems based on selected type
                switch (problemType) {
                    case "A":
                        correctAnswer = firstNum + secondNum;
                        System.out.print(firstNum + " + " + secondNum + " = ");
                        break;
                    case "S":
                        correctAnswer = firstNum - secondNum;
                        System.out.print(firstNum + " - " + secondNum + " = ");
                        break;
                    case "M":
                        correctAnswer = firstNum * secondNum;
                        System.out.print(firstNum + " * " + secondNum + " = ");
                        break;
                    case "D":
                        while (secondNum == 0) { // Avoid division by zero
                            secondNum = random.nextInt(highRange - lowRange + 1) + lowRange;
                        }
                        correctAnswer = firstNum / secondNum;
                        System.out.print(firstNum + " / " + secondNum + " = ");
                        break;
                }

                userAnswer = input.nextInt();
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct. Great job!");
                    correctAnswers++;
                } else {
                    System.out.println("Incorrect. Correct answer is " + correctAnswer);
                }
            }

            // Display results
            System.out.println("Problems correct: " + correctAnswers);
            System.out.println("Problems attempted: " + numProblems);
            System.out.println("Percentage correct: " + ((double) correctAnswers / numProblems * 100) + "%");

            // Ask if user wants to play again
            System.out.print("Would you like to play again? (Enter Y or N): ");
            playAgain = input.next().toUpperCase();
            correctAnswers = 0; // Reset the count for the next session
        }

        // Display outro message
        System.out.println("Thank you, " + name + ", for using the 3311 Flashcard system!");
        input.close();
    }
}
