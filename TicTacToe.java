import java.util.Scanner;

public class TicTacToe {
    public static char[][] board = new char[3][3];
    public static char currentPlayer = 'X';

    public static void main(String[] args) {
        //initializeBoard();
        //printBoard();

        Scanner keyboard = new Scanner(System.in);
        boolean gameOver = false;

        while(!gameOver){
            System.out.println("Player " + currentPlayer + " enter your move (row[0-1] & column[0-1]): ");
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();

            //if(isValidMove(row, col)){
                board[row][col] = currentPlayer;
                //printBoard();


        }
    }

    
}
