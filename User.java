import java.util.ArrayList;
import java.util.Random;

public class User
{
    private String name;
    private int turn;
    ArrayList<TilesAndTokens> userNatureTokens = new ArrayList<>();
    ArrayList<TilesAndTokens> natureTokens = Setup.natureTokens();

    //Add the tokens here as well

    User(String name, int turn)
    {
        this.name = name;
        this.turn = turn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void addNatureToken() {
        int index = new Random().nextInt(natureTokens.size());

        //add first element of the nature tokens to the current user's nature tokens
        userNatureTokens.add(natureTokens.get(index));
        natureTokens.remove(index);
    }

    public void natureTokensCount() {
        System.out.println(getName() + "'s nature tokens: " + userNatureTokens.size());
    }

    public  void spendToken() {
        int index = new Random().nextInt(userNatureTokens.size());
        userNatureTokens.remove(index);
    }
}
