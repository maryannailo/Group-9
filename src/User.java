public class User {
    private String userName;
    private int userTurn;

    public User(String username, int userTurn){
        this.userName = username;
        
    }

    public String getUsername() {
        return userName;
    }

    public int getUserTurn() {
        return userTurn;
    }
}
