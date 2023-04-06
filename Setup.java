import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Setup
{
    private List <User> userList = new ArrayList<>();

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
    private ArrayList<TilesAndTokens> habitats() {
        ArrayList<TilesAndTokens> habitatTiles = new ArrayList<>();

        habitatTiles.add(TilesAndTokens.FOREST);
        habitatTiles.add(TilesAndTokens.WETLAND);
        habitatTiles.add(TilesAndTokens.RIVER);
        habitatTiles.add(TilesAndTokens.MOUNTAIN);
        habitatTiles.add(TilesAndTokens.PRAIRIE);
        return habitatTiles;
    }

    // Define a lis of possible wildlife tokens
    private ArrayList<TilesAndTokens> wildlife() {
        ArrayList<TilesAndTokens> wildlifeTokens = new ArrayList<>();

        wildlifeTokens.add(TilesAndTokens.HAWK);
        wildlifeTokens.add(TilesAndTokens.BEAR);
        wildlifeTokens.add(TilesAndTokens.ELK);
        wildlifeTokens.add(TilesAndTokens.SALMON);
        wildlifeTokens.add(TilesAndTokens.FOX);
        return wildlifeTokens;
    }

    // Return the starter tile for each user
     ArrayList<TilesAndTokens> setStarterHabitatTile() {
        ArrayList<TilesAndTokens> habitatTiles = habitats();
        // shuffle the list and select the first two objects as the user's starter tile
        Collections.shuffle(habitatTiles);
        ArrayList<TilesAndTokens> starterTiles = new ArrayList<>();
        starterTiles.add(habitatTiles.get(0));
        starterTiles.add(habitatTiles.get(1));
        return starterTiles;
    }

    // Return shuffled habitat tiles
     ArrayList<TilesAndTokens> habitatTiles() {
         ArrayList<TilesAndTokens> habitatTiles = habitats();
         for (int i = 0; i < habitatTiles.size(); i++) {
             Collections.shuffle(habitatTiles);
        }
        return habitatTiles;
    }

    // Return shuffled wildlife tokens
    ArrayList<TilesAndTokens> wildlifeTokens() {
        ArrayList<TilesAndTokens> wildlifeTokens = wildlife();
        for (int i = 0; i < wildlifeTokens.size(); i++) {
            Collections.shuffle(wildlifeTokens);
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
