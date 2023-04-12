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
            //Add Error handling incase number inputed is not between 2 and 4
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
            User currentUser = setup.getUserByTurn(turnCounter);
            System.out.println("");
            System.out.println("It is " + currentUser.getName() + "'s turn.");
            display.displayMenu();
            choice = scan.nextInt();


            //Print out the name of the current persons turn and what turn it is
            switch(choice)
            {
                case 1: //Play turn
                    List<List<TilesAndTokens>> currentStarterTiles = allStarterTiles.get(currentUser.getTurn() - 1);
                    System.out.println("Your starter tile is: " + currentStarterTiles);
                    System.out.println("Your habitat tiles are: " + setup.habitatTiles());
                    System.out.println("Your wildlife tokens are: " + setup.wildlifeTokens());

                case 2: //Skip turn
                    turnCounter = (turnCounter % numPlayers) + 1;
                    break;

                case 3: // Exit
                    display.displayQuit();
                    break;
                default:
                    display.displayCommandNotPossible();
                    break;
            }

        }

    }

}
