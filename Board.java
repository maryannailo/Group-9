import java.util.Arrays;

public class Board {

    public static void printBoard(String[][][] board) {
        // Print column labels
        System.out.print("   ");
        for (int col = 0; col < board[0].length; col++) {
            System.out.print(" " + col + "   ");
        }
        System.out.println(); // Print newline after column labels

        for (int row = 0; row < board.length; row++) {
            // Print row label
            System.out.print(row + " ");

            for (int col = 0; col < board[row].length; col++) {
                // Print top left character of tile
                System.out.print(" " + board[row][col][0]);
            }
            System.out.println(); // Print newline after each row
        }
    }


}

//first the column labels isnt outputting for all coloumns
//the rest should not be outputting null
// trying to figure out how to put the tiles (2d arrays) inside the board at the right positions
//also swapping the colours on the tile