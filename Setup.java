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

    // Define a list of possible habitat tiles including keystones
    public static ArrayList<List<TilesAndTokens>> allTiles() {
        ArrayList<List<TilesAndTokens>> allTiles = new ArrayList<>();
        allTiles.addAll(habitats());
        allTiles.addAll(keystone());

        //shuffle the tiles
        Collections.shuffle(allTiles);

        return allTiles;
    }

    // Arraylist possible habitat tiles
    public static ArrayList<List<TilesAndTokens>> habitats() {
        ArrayList<TilesAndTokens> habitats = new ArrayList<>();

        habitats.add(TilesAndTokens.FOREST);
        habitats.add(TilesAndTokens.WETLAND);
        habitats.add(TilesAndTokens.RIVER);
        habitats.add(TilesAndTokens.MOUNTAIN);
        habitats.add(TilesAndTokens.PRAIRIE);

        //add all possible habitat tiles
        ArrayList<List<TilesAndTokens>> possibleTiles = new ArrayList<>();
        // 60 normal habitat tiles (6 * 10 possible tiles)
        for (int x = 0; x < 6; x++) {
            for (int i = 0; i < habitats.size(); i++) {
                for (int j = i+1; j < habitats.size(); j++) {
                    List<TilesAndTokens> habitatTiles = new ArrayList<>();
                    habitatTiles.add(habitats.get(i));
                    habitatTiles.add(habitats.get(j));
                    possibleTiles.add(habitatTiles);
                }
            }
        }
        return possibleTiles;
    }

    // Arraylist of possible keystones
    private static ArrayList<List<TilesAndTokens>> keystone() {
        //add keystones
        ArrayList<List<TilesAndTokens>> keystone = new ArrayList<>();
        // 25 keystones (5 * 5)
        for (int i = 0; i < 5; i++) {
            keystone.add(Collections.singletonList(TilesAndTokens.FORESTKEY));
            keystone.add(Collections.singletonList(TilesAndTokens.WETLANDKEY));
            keystone.add(Collections.singletonList(TilesAndTokens.RIVERKEY));
            keystone.add(Collections.singletonList(TilesAndTokens.MOUNTAINKEY));
            keystone.add(Collections.singletonList(TilesAndTokens.PRAIRIEKEY));
        }
        return keystone;
    }

    // Define a list of possible wildlife tokens
    private ArrayList<TilesAndTokens> wildlife() {
        ArrayList<TilesAndTokens> wildlifeTokens = new ArrayList<>();

        // add 100 possible wildlife tokens (20 * 5)
        for (int i = 0; i < 20; i++) {
            wildlifeTokens.add(TilesAndTokens.HAWK);
            wildlifeTokens.add(TilesAndTokens.BEAR);
            wildlifeTokens.add(TilesAndTokens.ELK);
            wildlifeTokens.add(TilesAndTokens.SALMON);
            wildlifeTokens.add(TilesAndTokens.FOX);
        }

        // shuffle tokens
        Collections.shuffle(wildlifeTokens);

        return wildlifeTokens;
    }

    private ArrayList<TilesAndTokens> natureTokens() {
        ArrayList<TilesAndTokens> natureTokens = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            natureTokens.add(TilesAndTokens.NATURE);
        }
        return natureTokens;
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

    boolean automaticCull(ArrayList<List<TilesAndTokens>> wildlifeTokens)
    {
        boolean cull = false;
        List<TilesAndTokens> firstToken = wildlifeTokens.get(0);

        for (int i = 1; i < wildlifeTokens.size(); i++)
        {
            List<TilesAndTokens> currentToken = wildlifeTokens.get(i);
            if(!firstToken.equals(currentToken))
            {
                return false;

            }

        }

        System.out.println("Cull Required, Replacing WildLife Tokens ");
        return true;

    }


    boolean optionalCull(ArrayList<List<TilesAndTokens>> wildlifeTokens) {
        int numMatches = 0;
        List<TilesAndTokens> firstMatch = null;
        for (List<TilesAndTokens> token : wildlifeTokens)
        {
            if (firstMatch == null)
            {
                firstMatch = token;
            }
            else if (token.equals(firstMatch))
            {
                numMatches++;
            }
        }
        return numMatches == 2;
    }

    // Function that allows to the users to take turns
    public int takeTurn(Scanner scan, int turnCounter) {
        User currentUser = getUserByTurn(turnCounter);
        System.out.println("It is " + currentUser.getName() + "'s turn.");
        display.displayMenu();
        return scan.nextInt();
    }

    // Function that gets the selected tile and token from the user
    public List<List<TilesAndTokens>> getSelectedTileAndToken(ArrayList<List<TilesAndTokens>> habitatTiles, ArrayList<List<TilesAndTokens>> wildlifeTokens) {
        List<List<TilesAndTokens>> selectedTileAndToken = new ArrayList<>();
        while (true) {
            System.out.print("Please select a habitat tile and wildlife token pair (1,2,3,4 respectively): ");
            int input = scan.nextInt();
            // error handling if there's incorrect input
            if (input > 4 || input < 1)
            {
                System.out.println("Invalid input. Try again.");
            }
            else
            {
                // get the value of the habitat tile and wildlife token using the input as the index
                List<TilesAndTokens> habitat = habitatTiles.get(input - 1);
                List<TilesAndTokens> wildlife = wildlifeTokens.get(input - 1);
                // add the elements to the list of selected tile and token pair
                selectedTileAndToken.add(habitat);
                selectedTileAndToken.add(wildlife);
                break;
            }
        }
        return selectedTileAndToken;
    }

    public boolean isMatch(List<List<TilesAndTokens>> selectedTileAndToken)
    {
        String habitatSymbol = String.valueOf(selectedTileAndToken.get(0).get(0));
        String wildlifeSymbol = String.valueOf(selectedTileAndToken.get(1).get(1));

        if (habitatSymbol.equals(HabitatAndWildlife.FOREST.toString())) {
            return wildlifeSymbol.equals(HabitatAndWildlife.FOX.toString());
        } else if (habitatSymbol.equals(HabitatAndWildlife.WETLAND.toString())) {
            return wildlifeSymbol.equals(HabitatAndWildlife.SALMON.toString());
        } else if (habitatSymbol.equals(HabitatAndWildlife.RIVER.toString())) {
            return wildlifeSymbol.equals(HabitatAndWildlife.BEAR.toString());
        } else if (habitatSymbol.equals(HabitatAndWildlife.MOUNTAIN.toString())) {
            return wildlifeSymbol.equals(HabitatAndWildlife.HAWK.toString());
        } else if (habitatSymbol.equals(HabitatAndWildlife.PRAIRIE.toString())) {
            return wildlifeSymbol.equals(HabitatAndWildlife.ELK.toString());
        }

        return false;
    }

    // Function to replace selected tile and token
    public void replacePairs(ArrayList<List<TilesAndTokens>> habitatTiles, ArrayList<List<TilesAndTokens>> wildlifeTokens, List<List<TilesAndTokens>> selectedTileAndToken) {
        for (int i = 0; i < habitatTiles.size(); i++) {
            // if the first element of the list (which is a tile) is equal to the element at index i, replace the element with a new habitat tile
            if (selectedTileAndToken.get(0) == habitatTiles.get(i)) {
                habitatTiles.set(i, habitatTiles().get(0));
                System.out.println("Your new habitat tiles are: " + habitatTiles);
            }
        }

        for (int j = 0; j < wildlifeTokens.size(); j++) {
            // if the second element of the list (which is a token) is equal to the element at index j, replace the element with a new wildlife token
            if (selectedTileAndToken.get(1) == wildlifeTokens.get(j)) {
                wildlifeTokens.set(j, wildlifeTokens().get(0));
                System.out.println("Your new wildlife tokens are: " + wildlifeTokens);
            }
        }
    }

    // function that detects if no more tiles are available
    public boolean isGameEnd() {
        return allTiles().size() == 0;
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
