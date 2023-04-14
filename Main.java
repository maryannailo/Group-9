import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
    static Setup setup = new Setup();
    static Display display = new Display();

    public static void main(String[] args)
    {
        display.displayWelcome();

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        String name;
        int turn;
        int turnCounter;
        int numPlayers = 0;
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

        for(int x = 1; x<=numPlayers; x++)
        {
            System.out.println("Please enter player " + x + "'s name:");
            name = scan.nextLine();
            User user = new User(name, x);
            setup.addUser(user);
            //Add users
            ArrayList<List<TilesAndTokens>> userStarterTile = setup.setStarterHabitatTile(user);
            ArrayList<List<TilesAndTokens>> userHabitatTiles = setup.habitatTiles();
            ArrayList<List<TilesAndTokens>> userWildlifeTokens = setup.wildlifeTokens();
            allStarterTiles.add(userStarterTile);
            allHabitatTiles.add(userHabitatTiles);
            allWildlifeTokens.add(userWildlifeTokens);
        }

        turnCounter = setup.turnCalculation();
        
                Scoring.bearScore();
        Scoring.foxScore();
        Scoring.elkScore();
        Scoring.hawkScore();
        Scoring.salmonScore();

        while(choice!=2)
        {
            // Allow the users to take turns playing the game
            User currentUser = setup.getUserByTurn(turnCounter);
            choice = setup.takeTurn(scan, turnCounter);

            //Print out the name of the current persons turn and what turn it is
            switch(choice) {
                case 1: //Play turn
                    List<List<TilesAndTokens>> currentStarterTiles = allStarterTiles.get(currentUser.getTurn() - 1);
                    ArrayList<List<TilesAndTokens>> currentHabitatTiles = allHabitatTiles.get(currentUser.getTurn() - 1);
                    ArrayList<List<TilesAndTokens>> currentWildlifeTokens = allWildlifeTokens.get(currentUser.getTurn() - 1);

                    System.out.println("Your starter tile is: " + currentStarterTiles);
                    System.out.println("Your habitat tiles are: " + currentHabitatTiles);
                    System.out.println("Your wildlife tokens are: " + currentWildlifeTokens);

                    ArrayList<List<TilesAndTokens>> replacedTokens1;
                    ArrayList<List<TilesAndTokens>> replacedTokens2;

                    if (setup.automaticCull(currentWildlifeTokens)) {
                        replacedTokens1 = setup.wildlifeTokens();
                        currentWildlifeTokens = replacedTokens1;
                        System.out.println("Your habitat tiles are: " + currentHabitatTiles);
                        System.out.println("Your wildlife tokens are: " + currentWildlifeTokens);
                        List<List<TilesAndTokens>> selectedTileAndToken = setup.getSelectedTileAndToken(currentHabitatTiles, replacedTokens1);
                        setup.replacePairs(currentHabitatTiles, replacedTokens1, selectedTileAndToken);
                    } else if (setup.optionalCull(currentWildlifeTokens)) {
                        System.out.println("You have the option to execute a cull (y/n)");
                        String in = scan.next();
                        if (in.equalsIgnoreCase("y")) {
                            replacedTokens2 = setup.wildlifeTokens();
                            currentWildlifeTokens = replacedTokens2;
                            System.out.println("Your habitat tiles are: " + currentHabitatTiles);
                            System.out.println("Your wildlife tokens are: " + currentWildlifeTokens);
                            List<List<TilesAndTokens>> selectedTileAndToken = setup.getSelectedTileAndToken(currentHabitatTiles, replacedTokens2);
                            setup.replacePairs(currentHabitatTiles, replacedTokens2, selectedTileAndToken);

                        } else if (in.equalsIgnoreCase("n")) {
                            break;
                        } else {
                            System.out.println("Invalid input. Try again.");
                        }
                    } else {
                        List<List<TilesAndTokens>> selectedTileAndToken = setup.getSelectedTileAndToken(currentHabitatTiles, currentWildlifeTokens);
                        
                    /*
                    if(!setup.isMatch(selectedTileAndToken))
                    {
                        System.out.println("The following token cannot be placed.");
                    }
                     */
                        
                        setup.replacePairs(currentHabitatTiles, currentWildlifeTokens, selectedTileAndToken);
                    }

                    // Allow the user not to place token
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("Do you want to place a token? (y/n)");
                        String tokenChoice = scan.next();
                        if (tokenChoice.equalsIgnoreCase("n")) {
                            // Do not place token
                            break;
                        } else if (tokenChoice.equalsIgnoreCase("y")) {
                            validInput = true;
                            // Continue with token placement code
                        } else {
                            System.out.println("Invalid input. Try again.");
                        }
                    }

                    if (setup.isGameEnd()) {
                        System.out.println("Game is over!");
                        choice = 2;
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
