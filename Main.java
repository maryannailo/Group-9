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
            allStarterTiles.add(userStarterTile);
        }

        turnCounter = setup.turnCalculation();

        while(choice!=3)
        {
            // Allow the users to take turns playing the game
            User currentUser = setup.getUserByTurn(turnCounter);
            choice = setup.takeTurn(scan, turnCounter);

            //Print out the name of the current persons turn and what turn it is
            switch(choice)
            {
                case 1: //Play turn
                    List<List<TilesAndTokens>> currentStarterTiles = allStarterTiles.get(currentUser.getTurn() - 1);
                    ArrayList<List<TilesAndTokens>> habitatTiles = setup.habitatTiles();
                    ArrayList<List<TilesAndTokens>> wildlifeTokens = setup.wildlifeTokens();

                    System.out.println("Your starter tile is: " + currentStarterTiles);
                    System.out.println("Your habitat tiles are: " + habitatTiles);
                    System.out.println("Your wildlife tokens are: " + wildlifeTokens);

                    List<List<TilesAndTokens>> selectedTileAndToken = setup.getSelectedTileAndToken(habitatTiles, wildlifeTokens);
                    setup.replacePairs(habitatTiles, wildlifeTokens, selectedTileAndToken);

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
