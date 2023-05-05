import java.util.*;

public class Setup
{
    Display display = new Display();
    Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    private List<User> userList = new ArrayList<>();

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
        for (int i = 1; i <= userList.size(); i++) {
            turns.add(i);
        }
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
            wildlifeTokens.add(TilesAndTokens.HAWKTOKEN);
            wildlifeTokens.add(TilesAndTokens.BEARTOKEN);
            wildlifeTokens.add(TilesAndTokens.ELKTOKEN);
            wildlifeTokens.add(TilesAndTokens.SALMONTOKEN);
            wildlifeTokens.add(TilesAndTokens.FOXTOKEN);
        }

        Collections.shuffle(wildlifeTokens);

        return wildlifeTokens;
    }

    protected static ArrayList<TilesAndTokens> natureTokens() {
        ArrayList<TilesAndTokens> natureTokens = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            natureTokens.add(TilesAndTokens.NATURE);
        }
        return natureTokens;
    }

    // Return the starter tile for each user
    protected ArrayList<List<TilesAndTokens>> setStarterHabitatTile(User user) {
        ArrayList<List<TilesAndTokens>> starterHabitatTiles = new ArrayList<>();

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

        List<TilesAndTokens> tiles1 = new ArrayList<>();
        List<TilesAndTokens> tiles2 = new ArrayList<>();

        if (keystone.equals(List.of(TilesAndTokens.MOUNTAINKEY))) {
            tiles1.add(TilesAndTokens.FOREST);
            tiles1.add(TilesAndTokens.WETLAND);

            tiles2.add(TilesAndTokens.RIVER);
            tiles2.add(TilesAndTokens.PRAIRIE);

            starterHabitatTiles.add(keystone);
            starterHabitatTiles.add(tiles1);
            starterHabitatTiles.add(tiles2);
        }

        if (keystone.equals(List.of(TilesAndTokens.FORESTKEY))) {
            tiles1.add(TilesAndTokens.MOUNTAIN);
            tiles1.add(TilesAndTokens.RIVER);

            tiles2.add(TilesAndTokens.WETLAND);
            tiles2.add(TilesAndTokens.PRAIRIE);

            starterHabitatTiles.add(keystone);
            starterHabitatTiles.add(tiles1);
            starterHabitatTiles.add(tiles2);
        }

        if (keystone.equals(List.of(TilesAndTokens.WETLANDKEY))) {
            tiles1.add(TilesAndTokens.RIVER);
            tiles1.add(TilesAndTokens.FOREST);

            tiles2.add(TilesAndTokens.MOUNTAIN);
            tiles2.add(TilesAndTokens.PRAIRIE);

            starterHabitatTiles.add(keystone);
            starterHabitatTiles.add(tiles1);
            starterHabitatTiles.add(tiles2);
        }

        if (keystone.equals(List.of(TilesAndTokens.PRAIRIEKEY))) {
            tiles1.add(TilesAndTokens.WETLAND);
            tiles1.add(TilesAndTokens.RIVER);

            tiles2.add(TilesAndTokens.FOREST);
            tiles2.add(TilesAndTokens.MOUNTAIN);

            starterHabitatTiles.add(keystone);
            starterHabitatTiles.add(tiles1);
            starterHabitatTiles.add(tiles2);
        }

        if (keystone.equals(List.of(TilesAndTokens.RIVERKEY))) {
            tiles1.add(TilesAndTokens.PRAIRIE);
            tiles1.add(TilesAndTokens.FOREST);

            tiles2.add(TilesAndTokens.WETLAND);
            tiles2.add(TilesAndTokens.PRAIRIE);

            starterHabitatTiles.add(keystone);
            starterHabitatTiles.add(tiles1);
            starterHabitatTiles.add(tiles2);
        }

        return starterHabitatTiles;
    }

    // Return shuffled habitat tiles
    protected ArrayList<List<TilesAndTokens>> habitatTiles() {
        ArrayList<List<TilesAndTokens>> habitats = allTiles();
        ArrayList<List<TilesAndTokens>> habitatTiles = new ArrayList<>();

        Collections.shuffle(habitats);
        for (int i = 0; i < 4; i++) {
            habitatTiles.add(habitats.get(i));
        }
        return habitatTiles;
    }

    // Return shuffled wildlife tokens
    protected ArrayList<List<TilesAndTokens>> wildlifeTokens() {
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

    // Allows to the users to take turns
    public int takeTurn(Scanner scan, int turnCounter) {
        User currentUser = getUserByTurn(turnCounter);
        System.out.println("It is " + currentUser.getName() + "'s turn.");
        display.displayMenu();
        return scan.nextInt();
    }

    // Gets the selected tile and token from the user
    public List<List<TilesAndTokens>> getSelectedTileAndToken(ArrayList<List<TilesAndTokens>> habitatTiles, ArrayList<List<TilesAndTokens>> wildlifeTokens) {
        List<List<TilesAndTokens>> selectedTileAndToken = new ArrayList<>();
        while (true) {
            System.out.print("Please select a habitat tile and wildlife token pair (1,2,3,4 respectively): ");
            int input = scan.nextInt();
            // error handling if there's incorrect input
            if (input > 4 || input < 1) {
                System.out.println("Invalid input. Try again.");
            } else {
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

    public void getNatureToken(List<List<TilesAndTokens>> selectedTileAndToken, User user) {
        // if (/*token is on keystone*/) {
        user.addNatureToken();
        System.out.println("You have earned a nature token!");
        //   } else {
    }

    public void spendNatureToken(ArrayList<List<TilesAndTokens>> habitatTiles, ArrayList<List<TilesAndTokens>> wildlifeTokens, User user) {
        user.spendToken();
        display.displayNatureTokenMenu();
        int input;
        boolean validInput = false;

        while (!validInput) {
            input = scan.nextInt();
            switch (input) {
                case 1:
                    selectAnyTileAndToken(habitatTiles, wildlifeTokens);
                    validInput = true;
                    break;
                case 2:
                    wipeWildlifeTokens(wildlifeTokens);
                    validInput = true;
                    break;
                default:
                    System.out.println("Invalid option, please enter 1 or 2: ");
                    break;
            }
        }
    }

    private void selectAnyTileAndToken(ArrayList<List<TilesAndTokens>> habitatTiles, ArrayList<List<TilesAndTokens>> wildlifeTokens) {
        List<List<TilesAndTokens>> selectedTileAndToken = new ArrayList<>();

        while (true) {
            System.out.print("Please select a habitat tile (1,2,3,4 respectively): ");
            int tileInput = scan.nextInt();
            System.out.print("Please select a wildlife token (1,2,3,4 respectively): ");
            int tokenInput = scan.nextInt();
            // error handling if there's incorrect input
            if (tileInput > 4 || tileInput < 1 || tokenInput > 4 || tokenInput < 1) {
                System.out.println("Invalid input. Try again.");
            } else {
                // get the value of the habitat tile and wildlife token using the input as the index
                List<TilesAndTokens> habitat = habitatTiles.get(tileInput - 1);
                List<TilesAndTokens> wildlife = wildlifeTokens.get(tokenInput - 1);
                // add the elements to the list of selected tile and token pair
                selectedTileAndToken.add(habitat);
                selectedTileAndToken.add(wildlife);
                break;
            }
        }
        System.out.println("You selected: " + selectedTileAndToken);
    }
    private void wipeWildlifeTokens(ArrayList<List<TilesAndTokens>> wildlifeTokens) {
        ArrayList<List<TilesAndTokens>> tokens = wildlifeTokens();
        HashSet<Integer> changedIndices = new HashSet<>();
        int numChanged = 0;

        System.out.println("Pick the wildlife tokens you want to clear (1, 2, 3, 4 respectively), or enter 0 to finish: ");
        int input = scan.nextInt();

        while (input != 0) {
            int index = new Random().nextInt(tokens.size());

            if (input >= 1 && input <= 4) {
                if (changedIndices.contains(input-1)) {
                    System.out.println("Element has already been changed. Please pick a different element to clear.");
                } else {
                    changedIndices.add(input-1);
                    numChanged++;
                    wildlifeTokens.remove(input-1);
                    wildlifeTokens.add(input-1, tokens.get(index));

                    // if all elements have been changed
                    if (numChanged == 4) {
                        System.out.println("All elements have been changed.");
                        break;
                    }
                }
            } else {
                System.out.println("Invalid input.");
            }

            System.out.println("Pick another element or enter 0 to finish: ");
            input = scan.nextInt();
        }

        System.out.println("Your new wildlife tokens are: " + wildlifeTokens);
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
        System.out.println("You selected: " + selectedTileAndToken);
        for (int i = 0; i < habitatTiles.size(); i++) {
            // if the first element of the list (which is a tile) is equal to the element at index i, replace the element with a new habitat tile
            if (selectedTileAndToken.get(0) == habitatTiles.get(i)) {
                habitatTiles.set(i, habitatTiles().get(0));
            }
        }

        for (int j = 0; j < wildlifeTokens.size(); j++) {
            // if the second element of the list (which is a token) is equal to the element at index j, replace the element with a new wildlife token
            if (selectedTileAndToken.get(1) == wildlifeTokens.get(j)) {
                wildlifeTokens.set(j, wildlifeTokens().get(0));
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
