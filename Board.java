import java.util.Arrays;

public class Board {

    public static void printBoard(String[][][] board) {
        int numRows = board.length;
        int numCols = board[0].length;

        // Print column labels
        System.out.print("   ");
        for (int col = 0; col < numCols; col++) {
            System.out.printf("%-5s", col);
        }
        System.out.println();

        // Print board with row labels
        for (int row = 0; row < numRows; row++) {
            System.out.printf("%-2s", row);
            for (int col = 0; col < numCols; col++) {
                if (board[row][col][0] == null) {
                    System.out.print("     ");
                } else {
                    System.out.printf("%-5s", board[row][col][0]);
                }
            }
            System.out.println();
        }
    }
    public static void placeTile(String[][][] board, String[][] tile, int row, int col) {
        for (int i = 0; i < tile.length; i++) {
            for (int j = 0; j < tile[i].length; j++) {
                if (board[row + i][col + j][0] == null){
                    board[row + i][col + j][0] = tile[i][j];
                }else{
                    System.out.println("Error: There is already a tile at this location.");
                }
            }
        }
    }
 
    
}
