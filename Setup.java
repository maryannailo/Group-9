import java.util.*;

public class Setup
{
    Display display = new Display();
    Scanner scan = new Scanner(System.in);
    static Random random = new Random(); // to generate random numbers
    private List<User> userList = new ArrayList<>(); // list to store user objects
    private TilesAndTokens placedToken;


    // add a user to the list
    void addUser(User user)
    {
        userList.add(user);
    }

    // return the user based on turn order
    User getUserByTurn(int turn) {
        for (User user : userList) {
            if (user.getTurn() == turn) {
                return user;
            }
        }
        return null;
    }

    // Calculates turn order randomly
    int turnCalculation() {
        List<Integer> turns = new ArrayList<>();
        // add turn numbers to the list based on the number of User objects
        for (int i = 1; i <= userList.size(); i++) {
            turns.add(i);
        }
        // Shuffle the turn numbers and return the first one
        Collections.shuffle(turns);
        return turns.get(0);
    }

    // Define a list of possible habitat tiles
    public static ArrayList<List<TilesAndTokens>> allTiles() {
        ArrayList<List<TilesAndTokens>> allTiles = new ArrayList<>();
        allTiles.addAll(habitats());
        allTiles.addAll(keystone());

        //shuffle the tiles
        Collections.shuffle(allTiles);

        return allTiles;
    }

    public static ArrayList<List<TilesAndTokens>> habitats() {
        ArrayList<TilesAndTokens> habitats = new ArrayList<>();

        habitats.add(TilesAndTokens.FOREST);
        habitats.add(TilesAndTokens.WETLAND);
        habitats.add(TilesAndTokens.RIVER);
        habitats.add(TilesAndTokens.MOUNTAIN);
        habitats.add(TilesAndTokens.PRAIRIE);

        //add all possible habitat tiles
        ArrayList<List<TilesAndTokens>> possibleTiles = new ArrayList<>();
        for (int i = 0; i < habitats.size(); i++) {
            for (int j = i+1; j < habitats.size(); j++) {
                List<TilesAndTokens> habitatTiles = new ArrayList<>();
                habitatTiles.add(habitats.get(i));
                habitatTiles.add(habitats.get(j));
                possibleTiles.add(habitatTiles);
            }
        }
        return possibleTiles;
    }

    private static ArrayList<List<TilesAndTokens>> keystone() {
        //add keystones
        ArrayList<List<TilesAndTokens>> keystone = new ArrayList<>();
        keystone.add(Collections.singletonList(TilesAndTokens.FORESTKEY));
        keystone.add(Collections.singletonList(TilesAndTokens.WETLANDKEY));
        keystone.add(Collections.singletonList(TilesAndTokens.RIVERKEY));
        keystone.add(Collections.singletonList(TilesAndTokens.MOUNTAINKEY));
        keystone.add(Collections.singletonList(TilesAndTokens.PRAIRIEKEY));

        return keystone;
    }

    // Define a lis of possible wildlife tokens
    private ArrayList<TilesAndTokens> wildlife() {
        ArrayList<TilesAndTokens> wildlifeTokens = new ArrayList<>();

        // add possible wildlife tokens
        wildlifeTokens.add(TilesAndTokens.HAWK);
        wildlifeTokens.add(TilesAndTokens.BEAR);
        wildlifeTokens.add(TilesAndTokens.ELK);
        wildlifeTokens.add(TilesAndTokens.SALMON);
        wildlifeTokens.add(TilesAndTokens.FOX);

        // shuffle tokens
        Collections.shuffle(wildlifeTokens);

        return wildlifeTokens;
    }

    // Return the starter tile for each user
    ArrayList<List<TilesAndTokens>> setStarterHabitatTile(User user) {
        ArrayList<List<TilesAndTokens>> starterHabitatTiles = new ArrayList<>();
        ArrayList<List<TilesAndTokens>> habitatTiles = habitats();

        // Choose one keystone randomly
        List<TilesAndTokens> keystone = new ArrayList<>();
        int index = random.nextInt(5);


        switch (index) {
            case 0 -> keystone.add(TilesAndTokens.FORESTKEY);
            case 1 -> keystone.add(TilesAndTokens.WETLANDKEY);
            case 2 -> keystone.add(TilesAndTokens.RIVERKEY);
            case 3 -> keystone.add(TilesAndTokens.MOUNTAINKEY);
            case 4 -> keystone.add(TilesAndTokens.PRAIRIEKEY);
        }


        // Choose two habitat tiles randomly
        Collections.shuffle(habitatTiles);

        List<TilesAndTokens> tiles1 = habitatTiles.get(0);
        List<TilesAndTokens> tiles2 = habitatTiles.get(1);

        starterHabitatTiles.add(keystone);
        starterHabitatTiles.add(tiles1);
        starterHabitatTiles.add(tiles2);

        return starterHabitatTiles;
    }


    // Return shuffled habitat tiles
    ArrayList<List<TilesAndTokens>> habitatTiles() {
        ArrayList<List<TilesAndTokens>> habitats = allTiles();
        ArrayList<List<TilesAndTokens>> habitatTiles = new ArrayList<>();

        Collections.shuffle(habitats);
        for (int i = 0; i < 4; i++) {
            habitatTiles.add(habitats.get(i));
        }
        return habitatTiles;
    }

    // Return shuffled wildlife tokens
    ArrayList<List<TilesAndTokens>> wildlifeTokens() {
        ArrayList<List<TilesAndTokens>> wildlifeTokens = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Collections.shuffle(wildlife());
            wildlifeTokens.add(Collections.singletonList(wildlife().get(i)));
        }
        return wildlifeTokens;
    }

    public int takeTurn(Scanner scan, int turnCounter) {
        User currentUser = getUserByTurn(turnCounter);
        System.out.println("");
        System.out.println("It is " + currentUser.getName() + "'s turn.");
        display.displayMenu();
        int choice = scan.nextInt();
        return choice;
    }

    // Function that gets the selected tile and token from the user
    public List<List<TilesAndTokens>> getSelectedTileAndToken(ArrayList<List<TilesAndTokens>> habitatTiles, ArrayList<List<TilesAndTokens>> wildlifeTokens) {
        List<List<TilesAndTokens>> selectedTileAndToken = new ArrayList<>();
        while (true) {
            System.out.print("Please select a habitat tile and wildlife token pair (1,2,3,4 respectively): ");
            int input = scan.nextInt();
            if (input > 4 || input < 1) {
                System.out.println("Invalid input. Try again.");
            } else {
                List<TilesAndTokens> habitat = habitatTiles.get(input - 1);
                List<TilesAndTokens> wildlife = wildlifeTokens.get(input - 1);
                selectedTileAndToken.add(habitat);
                selectedTileAndToken.add(wildlife);
                System.out.println(selectedTileAndToken);
                break;
            }
        }
        return selectedTileAndToken;
    }

    public void replacePairs(ArrayList<List<TilesAndTokens>> habitatTiles, ArrayList<List<TilesAndTokens>> wildlifeTokens, List<List<TilesAndTokens>> selectedTileAndToken) {
        for (int i = 0; i < habitatTiles.size(); i++) {
            if (selectedTileAndToken.get(0) == habitatTiles.get(i)) {
                habitatTiles.set(i, habitatTiles().get(0));
                System.out.println("Your new habitat tiles are: " + habitatTiles);
            }
        }

        for (int j = 0; j < wildlifeTokens.size(); j++) {
            if (selectedTileAndToken.get(1) == wildlifeTokens.get(j)) {
                wildlifeTokens.set(j, wildlifeTokens().get(0));
                System.out.println("Your new wildlife tokens are: " + wildlifeTokens);
            }
        }
    }

    private void showUserTiles(String name)
    {
        for(User user: userList)
        {
            if(user.getName().equals(name))
            {
                //Supposed to pass through the current tokens and tiles each person has
            }
        }
    }


}
