import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main
{
    static Setup setup = new Setup();
    static String in;
    static Display display = new Display();

    public static void main(String[] args)
    {
        display.displayWelcome();

        Scanner scan = new Scanner(System.in);
        
        int choice = 0;
        String name;
        int turnCounter;
        int numPlayers = 2;
        String[][][] board = new String[50][50][50];

        List<ArrayList<List<TilesAndTokens>>> allStarterTiles = new ArrayList<>();
        List<ArrayList<List<TilesAndTokens>>> allHabitatTiles = new ArrayList<>();
        List<ArrayList<List<TilesAndTokens>>> allWildlifeTokens = new ArrayList<>();

        while (numPlayers < 2 || numPlayers > 4) {
            //Add Error handling in case input is not between 2 and 4
            System.out.println("Please enter the Number of Players playing 2-4:");
            try {
                numPlayers = scan.nextInt();
                scan.nextLine(); // to clear input buffer
                if (numPlayers < 2 || numPlayers > 4) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }

        System.out.println("Please enter player 1's name:");
        name = scan.nextLine();


        User user = new User(name, 1);
        setup.addUser(user);
        //Add users
        ArrayList<List<TilesAndTokens>> userStarterTile = setup.setStarterHabitatTile(user);
        ArrayList<List<TilesAndTokens>> userHabitatTiles = setup.habitatTiles();
        ArrayList<List<TilesAndTokens>> userWildlifeTokens = setup.wildlifeTokens();
        allStarterTiles.add(userStarterTile);
        allHabitatTiles.add(userHabitatTiles);
        allWildlifeTokens.add(userWildlifeTokens);

        User bot = new User("Bot", 2);
        setup.addUser(bot);
        //Add users
        ArrayList<List<TilesAndTokens>> botStarterTile = setup.setStarterHabitatTile(bot);
        ArrayList<List<TilesAndTokens>> botHabitatTiles = setup.habitatTiles();
        ArrayList<List<TilesAndTokens>> botWildlifeTokens = setup.wildlifeTokens();
        allStarterTiles.add(botStarterTile);
        allHabitatTiles.add(botHabitatTiles);
        allWildlifeTokens.add(botWildlifeTokens);

        turnCounter = setup.turnCalculation();

        Scoring.bearScore();
        Scoring.foxScore();
        Scoring.elkScore();
        Scoring.hawkScore();
        Scoring.salmonScore();

        while(choice!=3)
        {
            // Allow the users to take turns playing the game
            User currentUser = setup.getUserByTurn(turnCounter);
            choice = setup.takeTurn(scan, turnCounter);
            if(currentUser.getName()=="Bot")
            {

                System.out.println("It is Now the Bot's Turn");
                choice=Bot.getTurnChoice();
            }
            else
            {
                choice = setup.takeTurn(scan, turnCounter);
            }

            //Print out the name of the current persons turn and what turn it is
            switch(choice) {
                case 1: //Play turn
                    List<List<TilesAndTokens>> currentStarterTiles = allStarterTiles.get(currentUser.getTurn() - 1);
                    ArrayList<List<TilesAndTokens>> currentHabitatTiles = allHabitatTiles.get(currentUser.getTurn() - 1);
                    ArrayList<List<TilesAndTokens>> currentWildlifeTokens = allWildlifeTokens.get(currentUser.getTurn() - 1);

                    String[][] starterTile = HabitatTiles.displayStarterTile(currentStarterTiles);

                    System.out.println("Your starter tile is now on the board:");
                    // display the board in the middle
                    Board.placeTile(board, starterTile, 25, 25, currentUser);
                    Board.printBoard(board, currentUser);;

                    System.out.println("Your habitat tiles are: " + currentHabitatTiles);
                    System.out.println("Your wildlife tokens are: " + currentWildlifeTokens);

                    ArrayList<List<TilesAndTokens>> replacedTokens1;
                    ArrayList<List<TilesAndTokens>> replacedTokens2;

                    List<TilesAndTokens> tileChosen = new ArrayList<>();
                    List<TilesAndTokens> tokenChosen = new ArrayList<>();

                    if (setup.automaticCull(currentWildlifeTokens)) {
                        replacedTokens1 = setup.wildlifeTokens();
                        currentWildlifeTokens = replacedTokens1;
                        System.out.println("Your habitat tiles are: " + currentHabitatTiles);
                        System.out.println("Your wildlife tokens are: " + currentWildlifeTokens);
                        List<List<TilesAndTokens>> selectedTileAndToken = setup.getSelectedTileAndToken(currentHabitatTiles, replacedTokens1);
                        tileChosen = selectedTileAndToken.get(0);
                        tokenChosen = selectedTileAndToken.get(1);
                        setup.replacePairs(currentHabitatTiles, replacedTokens1, selectedTileAndToken);
                    } else if (setup.optionalCull(currentWildlifeTokens)) {
                        System.out.println("You have the option to execute a cull (y/n)");
                        String in = scan.next();
                        if(currentUser.getName()=="Bot")
                        {


                            in=Bot.getCullChoice();
                        }
                        else
                        {
                            in = scan.next();
                        }
                        if (in.equalsIgnoreCase("y")) {
                            replacedTokens2 = setup.wildlifeTokens();
                            currentWildlifeTokens = replacedTokens2;
                            System.out.println("Your habitat tiles are: " + currentHabitatTiles);
                            System.out.println("Your wildlife tokens are: " + currentWildlifeTokens);
                            List<List<TilesAndTokens>> selectedTileAndToken = setup.getSelectedTileAndToken(currentHabitatTiles, replacedTokens2);
                            tileChosen = selectedTileAndToken.get(0);
                            tokenChosen = selectedTileAndToken.get(1);
                            setup.replacePairs(currentHabitatTiles, replacedTokens2, selectedTileAndToken);

                        } else if (in.equalsIgnoreCase("n")) {
                            break;
                        } else {
                            System.out.println("Invalid input. Try again.");
                        }
                    } else {
                        List<List<TilesAndTokens>> selectedTileAndToken = setup.getSelectedTileAndToken(currentHabitatTiles, currentWildlifeTokens);
                        tileChosen = selectedTileAndToken.get(0);
                        tokenChosen = selectedTileAndToken.get(1);
                    /*
                    if(!setup.isMatch(selectedTileAndToken))
                    {
                        System.out.println("The following token cannot be placed.");
                    }
                     */

                        setup.replacePairs(currentHabitatTiles, currentWildlifeTokens, selectedTileAndToken);
                    }

                    System.out.println("Where do you want to place " + tileChosen);
                    System.out.println("Enter row number: ");
                    int row = scan.nextInt();
                    System.out.println("Enter column number: ");
                    int column = scan.nextInt();

                   // Board.placeTile(board, starterTile, 25, 25);
                    String[][] tile = HabitatTiles.convertTileToDisplay(tileChosen);
                    Board.placeTile(board, tile, row, column, currentUser);
                    Board.printBoard(board, currentUser);


                    // Allow the user not to place token
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("Do you want to place the token " + tokenChosen + "? (y/n)");
                        String tokenChoice = scan.next();
                        if (tokenChoice.equalsIgnoreCase("n")) {
                            // Do not place token
                            break;
                        } else if (tokenChoice.equalsIgnoreCase("y")) {
                            String oldStr = "E";
                           // int col = 0;
                         //   int row = 0;

                           // Board.placeToken(board, tile, row, col, oldStr, currentUser);
                            Board.printBoard(board, currentUser);
                            System.out.println("You placed " + tokenChosen);
                            validInput = true;
                            // Continue with token placement code
                        } else {
                            System.out.println("Invalid input. Try again.");
                        }

                        System.out.println("Your new habitat tiles are: " + currentHabitatTiles);
                        System.out.println("Your new wildlife tokens are: " + currentWildlifeTokens);
                    }

                    if (setup.isGameEnd()) {
                        System.out.println("Game is over!");
                        break;
                    }

                case 2: //Skip turn
                    turnCounter = (turnCounter % numPlayers) + 1;
                    break;

                default:
                    display.displayCommandNotPossible();
                    break;
            }
        }
    }
}
