import java.util.Random;
import java.util.Scanner;

public class HW3 {
    private static final int SIZE = 10;
    private static final char EMPTY = '_';
    private static final char PLAYER = 'X';
    private static final char HOME = '^';
    private static final char POTHOLE = 'O';

    private char[][] grid;
    private int playerX, playerY;
    private Random random = new Random();

    public HW3() {
        resetGame();
    }

    // resets the game with a fresh 10x10 grid, placing potholes, player, and home
    private void resetGame() {
        grid = new char[SIZE][SIZE];

        // grid with empty spaces
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = EMPTY;
            }
        }
        playerX = 0;
        playerY = 0;
        grid[playerX][playerY] = PLAYER;
        
        grid[SIZE - 1][SIZE - 1] = HOME;

        // Place 5 unique random potholes
        int potholeCount = 0;
        while (potholeCount < 5) {
            int x = random.nextInt(SIZE);
            int y = random.nextInt(SIZE);

            if (grid[x][y] == EMPTY) {
                grid[x][y] = POTHOLE;
                potholeCount++;
            }
        }
    }

    // Displaying the grid while hiding potholes
    private void displayGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == playerX && j == playerY) {
                    System.out.print(PLAYER + " ");
                } else if (grid[i][j] == HOME) {
                    System.out.print(HOME + " ");
                } else {
                    System.out.print(EMPTY + " ");
                }
            }
            System.out.println();
        }
    }

    // user input and moves the player
    private boolean movePlayer(int dx, int dy) {
        int newX = playerX + dx;
        int newY = playerY + dy;

        // Check if move is within bounds
        if (newX < 0 || newX >= SIZE || newY < 0 || newY >= SIZE) {
            System.out.println("Invalid move! Stay within the grid.");
            return false;
        }

       
        playerX = newX;
        playerY = newY;

        // to check if player landed on a pothole
        if (grid[playerX][playerY] == POTHOLE) {
            System.out.println("OH NO! POTHOLE! You lost!");
            return true;
        }

        // to check if player reached home
        if (playerX == SIZE - 1 && playerY == SIZE - 1) {
            System.out.println("Congratulations! You reached home safely!");
            return true;
        }

        return false;
    }

    
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        System.out.println("Welcome to Pothole Driving! Get home while avoiding potholes!");

        while (!gameOver) {
            displayGrid();
            System.out.println("\nEnter either a -1, 0, or 1 in the X or 9 to quit: ");
            int dx = scanner.nextInt();

            if (dx == 9) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Enter either a -1, 0, or 1 in the Y: ");
            int dy = scanner.nextInt();

            // Validate move
            if ((dx < -1 || dx > 1) || (dy < -1 || dy > 1)) {
                System.out.println("Invalid input! Enter only -1, 0, or 1.");
                continue;
            }

            gameOver = movePlayer(dx, dy);
        }

        System.out.println("Would you like to play again? (yes/no): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("yes")) {
            resetGame();
            playGame();
        } else {
            System.out.println("Goodbye!");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        HW3 game = new HW3();
        game.playGame();
    }
}
