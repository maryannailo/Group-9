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
                if (null == board[row][col][0]) {
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





    //this will replace the potential token in the string and make it the actual token
    //chosen by the player
    private static String replace (String[][] arr, String oldSubstr, String newSubstr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains(oldSubstr)) {
                    arr[i][j] = arr[i][j].replace(oldSubstr, newSubstr);
                }
            }
        }
        return Arrays.toString(arr);
    }

    //This is for the nature token, this will check if a tile has a nature token inside, when the player places a token onto the tile
    private static boolean checkSequence2DString(String[][] tileChosen){
        String sequence = new String(String.valueOf(TilesAndTokens.KEY.getSymbol()));
        for (int i = 0; i < tileChosen.length; i++) {
            for (int j = 0; j < tileChosen[i].length; j++) {
                if (tileChosen[i][j].contains(sequence)) {

                    return true;
                }
            }
        }

        return false;
    }


    public static void placeToken(String[][][] board,String [][] tileChosen ,int row, int col, String oldStr, User user) {
        String[][] tile = new String[][]{board[row][col]};
        String newStr = null;

        for (int i = 0; i < tile.length; i++) {
            for (int j = 0; j < tile[i].length; j++) {
                switch (oldStr) {
                    case "E" -> {
                        newStr = String.valueOf(TilesAndTokens.ELKTOKEN.getSymbol());
                        replace(tileChosen, oldStr, newStr);
                        if (checkSequence2DString(tileChosen) == true) {
                            System.out.println("Nature Token added");
                            user.addNatureToken();
                        }
                        break;
                    }
                    case "F" -> {
                        newStr = String.valueOf(TilesAndTokens.FOXTOKEN.getSymbol());
                        replace(tileChosen, oldStr, newStr);
                        if (checkSequence2DString(tileChosen) == true) {
                            System.out.println("Nature Token added");
                            user.addNatureToken();
                        }
                        break;
                    }
                    case "H" -> {
                        newStr = String.valueOf(TilesAndTokens.HAWKTOKEN.getSymbol());
                        replace(tileChosen, oldStr, newStr);
                        if (checkSequence2DString(tileChosen) == true) {
                            System.out.println("Nature Token added");
                            user.addNatureToken();
                        }
                        break;
                    }
                    case "S" -> {
                        newStr = String.valueOf(TilesAndTokens.SALMONTOKEN.getSymbol());
                        replace(tileChosen, oldStr, newStr);
                        if (checkSequence2DString(tileChosen) == true) {
                            System.out.println("Nature Token added");
                            user.addNatureToken();
                        }
                        break;
                    }
                    case "B" -> {
                        newStr = String.valueOf(TilesAndTokens.BEARTOKEN.getSymbol());
                        replace(tileChosen, oldStr, newStr);
                        if (checkSequence2DString(tileChosen) == true) {
                            System.out.println("Nature Token added");
                            user.addNatureToken();
                        }
                        break;
                    }
                    default -> System.out.println("Cannot place this token onto the tile");
                }
            }
        }
    }

    public static String[][] swapColors(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].contains(DisplayColour.LIGHTGREEN) && j < 3) {
                    array[i][j] = array[i][j].replace(DisplayColour.LIGHTGREEN, DisplayColour.YELLOW);
                } else if (array[i][j].contains(DisplayColour.YELLOW) && j > 3) {
                    array[i][j] = array[i][j].replace(DisplayColour.YELLOW, DisplayColour.LIGHTGREEN);
                }
            }
        }
        return array;
    }

}

