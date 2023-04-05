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
