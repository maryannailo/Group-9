public class User
{
    private String name;
    private int turn;
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
}