import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3]; // 3x3 game board
    private static char currentPlayer = 'X'; // Player X starts first

    public static void main(String[] args) {
        initializeBoard(); // Initialize the board with empty spaces
        printBoard(); // Display the initial board

        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("Player " + currentPlayer + ", enter your move (row [0-2] and column [0-2]): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer; // Place the player's mark
                printBoard(); // Display the updated board

                if (checkWin()) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameOver = true;
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    switchPlayer(); // Switch to the other player
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
        scanner.close();
    }

    // Initialize the board with empty spaces
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the current state of the board
    private static void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check if the move is valid
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    // Check if the current player has won
    private static boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }

        return false;
    }

    // Check if the board is full (draw)
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Switch players between X and O
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}