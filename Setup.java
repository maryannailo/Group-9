import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Setup
{
    private List <User> userList = new ArrayList<>();

    void addUser(User user)
    {
        userList.add(user);
    
    User getUserByTurn(int turn) {
        for (User user : userList) {
            if (user.getTurn() == turn) {
                return user;
            }
        }
        return null;
    }
    
    int turnCalculation() {
        List<Integer> turns = new ArrayList<>();
        for (int i = 1; i <= userList.size(); i++) {
            turns.add(i);
        }
        Collections.shuffle(turns);
        return turns.get(0);
    }
    
    ArrayList<TilesAndTokens> setStarterHabitatTile() {
        ArrayList<TilesAndTokens> habitatTiles = new ArrayList<>();
        // add all available starter tiles to the list
        habitatTiles.add(TilesAndTokens.FOREST);
        habitatTiles.add(TilesAndTokens.WETLAND);
        habitatTiles.add(TilesAndTokens.RIVER);
        habitatTiles.add(TilesAndTokens.MOUNTAIN);
        habitatTiles.add(TilesAndTokens.PRAIRIE);
        // shuffle the list and select the first two objects as the user's starter tile
        Collections.shuffle(habitatTiles);
        ArrayList<TilesAndTokens> starterTiles = new ArrayList<>();
        starterTiles.add(habitatTiles.get(0));
        starterTiles.add(habitatTiles.get(1));
        return starterTiles;
    }

    private void showUserTiles(String name)
    {
        for(User user: userList)
        {
            if(user.getName().equals(name))
            {
                System.out.println();//Supposed to pass through the current tokens and tiles each person has
            }
        }
    }

}
