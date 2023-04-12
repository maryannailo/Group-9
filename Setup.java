import java.util.*;

public class Setup
{
    private List <User> userList = new ArrayList<>();
    static Random random = new Random();

    void addUser(User user)
    {
        userList.add(user);
    }

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
        // Shuffle the turn numbers and return the first one
        Collections.shuffle(turns);
        return turns.get(0);
    }

    // Define a list of possible habitat tiles
    public static ArrayList<List<TilesAndTokens>> habitats() {
        ArrayList<List<TilesAndTokens>> allTiles = new ArrayList<>();
        ArrayList<TilesAndTokens> habitats = new ArrayList<>();

        habitats.add(TilesAndTokens.FOREST);
        habitats.add(TilesAndTokens.WETLAND);
        habitats.add(TilesAndTokens.RIVER);
        habitats.add(TilesAndTokens.MOUNTAIN);
        habitats.add(TilesAndTokens.PRAIRIE);

        //add all possible habitat tiles
        for (int i = 0; i < habitats.size(); i++) {
            for (int j = i+1; j < habitats.size(); j++) {
                List<TilesAndTokens> habitatTiles = new ArrayList<>();
                habitatTiles.add(habitats.get(i));
                habitatTiles.add(habitats.get(j));
                allTiles.add(habitatTiles);
            }
        }
        //add keystones
        allTiles.add(Collections.singletonList(TilesAndTokens.FORESTKEY));
        allTiles.add(Collections.singletonList(TilesAndTokens.WETLANDKEY));
        allTiles.add(Collections.singletonList(TilesAndTokens.RIVERKEY));
        allTiles.add(Collections.singletonList(TilesAndTokens.MOUNTAINKEY));
        allTiles.add(Collections.singletonList(TilesAndTokens.PRAIRIEKEY));

        //shuffle the tiles
        Collections.shuffle(allTiles);

        return allTiles;
    }

    // Define a lis of possible wildlife tokens
    private ArrayList<TilesAndTokens> wildlife() {
        ArrayList<TilesAndTokens> wildlifeTokens = new ArrayList<>();

        wildlifeTokens.add(TilesAndTokens.HAWK);
        wildlifeTokens.add(TilesAndTokens.BEAR);
        wildlifeTokens.add(TilesAndTokens.ELK);
        wildlifeTokens.add(TilesAndTokens.SALMON);
        wildlifeTokens.add(TilesAndTokens.FOX);

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

        if (index == 0) {
            keystone.add(TilesAndTokens.FORESTKEY);
        } else if (index == 1) {
            keystone.add(TilesAndTokens.WETLANDKEY);
        } else if (index == 2) {
            keystone.add(TilesAndTokens.RIVERKEY);
        } else if (index == 3) {
            keystone.add(TilesAndTokens.MOUNTAINKEY);
        } else if (index == 4) {
            keystone.add(TilesAndTokens.PRAIRIEKEY);
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
        ArrayList<List<TilesAndTokens>> habitats= habitats();
        ArrayList<List<TilesAndTokens>> habitatTiles = new ArrayList<>();

        Collections.shuffle(habitats);
        for (int i = 0; i < 4; i++) {
            habitatTiles.add(habitats.get(i));
        }
        return habitatTiles;
    }

    // Return shuffled wildlife tokens
    ArrayList<TilesAndTokens> wildlifeTokens() {
        ArrayList<TilesAndTokens> wildlifeTokens = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Collections.shuffle(wildlife());
            wildlifeTokens.add(wildlife().get(i));
        }
        return wildlifeTokens;
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
