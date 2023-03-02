import java.util.ArrayList;
import java.util.List;

public class Setup
{
    private List <User> userList = new ArrayList<>();

    void addUser(User user)
    {
        userList.add(user);
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
