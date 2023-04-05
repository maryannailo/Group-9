import java.util.Scanner;
public class Main
{
    static Setup setup = new Setup();
    static Display display = new Display();
    
    public static void main(String[] args)
    {
        display.displayWelcome();
        
        Scanner scan = new Scanner(System.in);
        int numPlayers = 0;
        int choice = 0;
        String name;
        int turn;
        int turnCounter;
        
        //Add Error handling incase number inputed is not between 2 and 4
        while (numPlayers < 2 || numPlayers > 4) {
            System.out.println("Please enter the Number of Players playing 2-4");
            try {
                numPlayers = scan.nextInt();
                scan.nextLine(); // do this to clear input buffer
                if (numPlayers < 2 || numPlayers > 4) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }
       
        for(int x = 1; x<=numPlayers; x++)
        {
            System.out.println("Please enter player " + x + "'s name");
            name = scan.nextLine();
            User user = new User(name, x);
            setup.addUser(user);
            //Add users
        }

        turnCounter = setup.turnCalculation();

        while(choice!=3)
        {
            User currentUser = setup.getUserByTurn(turnCounter);
            System.out.println("");
            System.out.println("It is " + currentUser.getName() + "'s turn.");
            System.out.println("What would you like to do?");
            System.out.println("1. Play turn");
            System.out.println("2. Next player");
            System.out.println("3. Quit");
            choice = scan.nextInt();

            //Print out the name of the current persons turn and what turn it is
            switch(choice)
            {
                case 1: //Play turn

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
