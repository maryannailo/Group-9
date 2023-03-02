import java.util.Scanner;
public class Main
{
    static Setup setup = new Setup();
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int choice =0 ;
        String name;
        int turn;
        int turnCounter;


        System.out.println("Please enter the Number of Players playing 2-4");
        int numPlayers = scan.nextInt();
        //Add Error handling incase number inputed is not between 2 and 4

        for(int x = 0; x<numPlayers; x++)
        {
            System.out.println("Please enter your name");
            name =scan.nextLine();
            User user = new User(name, x+1);
            setup.addUser(user);
            //Add users
        }


        while(choice!=3)
        {
            System.out.println("");
            choice = scan.nextInt();

            //Print out the name of the current persons turn and what turn it is
            switch(choice)
            {
                case 1: //Play turn

                case 2: //Skip turn


                case 3: // Exit
                    choice =3;
                    break;

            }



        }




    }


int turnCalculation()
{
//Do the turn Calculation Function to randomise each player turn based on the number of players inputted
    return 0;
}

}