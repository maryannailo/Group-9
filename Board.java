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
    private static void replace (String[][] arr, String oldSubstr, String newSubstr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains(oldSubstr)) {
                    arr[i][j] = arr[i][j].replace(oldSubstr, newSubstr);
                }
            }
        }
    }

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
                        if (checkSequence2DString(tileChosen)) {
                            System.out.println("Nature Token added");
                            user.addNatureToken();
                        }
                        break;
                    }
                    case "F" -> {
                        newStr = String.valueOf(TilesAndTokens.FOXTOKEN.getSymbol());
                        replace(tileChosen, oldStr, newStr);
                        if (checkSequence2DString(tileChosen)) {
                            System.out.println("Nature Token added");
                            user.addNatureToken();
                        }
                        break;
                    }
                    case "H" -> {
                        newStr = String.valueOf(TilesAndTokens.HAWKTOKEN.getSymbol());
                        replace(tileChosen, oldStr, newStr);
                        if (checkSequence2DString(tileChosen)) {
                            System.out.println("Nature Token added");
                            user.addNatureToken();
                        }
                        break;
                    }
                    case "S" -> {
                        newStr = String.valueOf(TilesAndTokens.SALMONTOKEN.getSymbol());
                        replace(tileChosen, oldStr, newStr);
                        if (checkSequence2DString(tileChosen)) {
                            System.out.println("Nature Token added");
                            user.addNatureToken();
                        }
                        break;
                    }
                    case "B" -> {
                        newStr = String.valueOf(TilesAndTokens.BEARTOKEN.getSymbol());
                        replace(tileChosen, oldStr, newStr);
                        if (checkSequence2DString(tileChosen)) {
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

    private static String[][] swapColours(String[][] array, String leftColour, String rightColour) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].contains(leftColour)) {
                    array[i][j] = array[i][j].replace(leftColour, DisplayColour.RESET);
                    array[i][j] = array[i][j].replace(rightColour, leftColour);
                    array[i][j] = array[i][j].replace(DisplayColour.RESET, rightColour);
                }
            }
        }
        return array;
    }


//This method will swap the colours of the tile from left to right depending on the tile chosen by the player using the method swapColours
    public static String[][] rotate(String[][] tileChosen, int colourOption){
       String leftColour = null;
       String rightColour = null;
       if (colourOption < 1 || colourOption > 10){
           throw new RuntimeException("Choose a number between 1 and 10");
       }else{
           switch (colourOption){
               case 1:
                   //Tile is forest and prairie
                   leftColour = DisplayColour.DARKGREEN;
                   rightColour = DisplayColour.YELLOW;
                   break;
               case 2:
                   //Tile is forest and wetland
                   leftColour = DisplayColour.DARKGREEN;
                   rightColour = DisplayColour.LIGHTGREEN;
                   break;
               case 3:
                   //Tile is wetland and prairie
                   leftColour = DisplayColour.LIGHTGREEN;
                   rightColour = DisplayColour.YELLOW;
                   break;
               case 4:
                   //Tile is wetland and mountain
                   leftColour = DisplayColour.LIGHTGREEN;
                   rightColour = DisplayColour.GREY;
                   break;
               case 5:
                   //Tile is prairie and mountain
                   leftColour = DisplayColour.YELLOW;
                   rightColour = DisplayColour.GREY;
                   break;
               case 6:
                   //Tile is wetland and river
                   leftColour = DisplayColour.LIGHTGREEN;
                   rightColour = DisplayColour.BLUE;
                   break;
               case 7:
                   //Tile is mountain and river
                   leftColour = DisplayColour.GREY;
                   rightColour = DisplayColour.BLUE;
                   break;
               case 8:
                   //Tile is river and forest
                   leftColour = DisplayColour.BLUE;
                   rightColour = DisplayColour.DARKGREEN;
                   break;
               case 9:
                   //Tile is prairie and river
                   leftColour = DisplayColour.YELLOW;
                   rightColour = DisplayColour.BLUE;
                   break;
               case 10:
                   //Tile is mountain and forest
                   leftColour = DisplayColour.GREY;
                   rightColour = DisplayColour.DARKGREEN;
                   break;
               default:
                   System.out.println("Please choose another option between 1 and 10");
           }
        return swapColours(tileChosen, leftColour,rightColour);
       }
    }
}


