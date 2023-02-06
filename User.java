import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

//
public class User{
    private final int numofUsers;
    public ArrayList<String> userNames;
    public int userTurn;

   public User(){
       Scanner number = new Scanner(System.in);

       System.out.println("Enter the number of players, this number must be between 2 and 4: ");
       numofUsers = number.nextInt();

       if (numofUsers < 2 || numofUsers > 4){
           System.out.println("Incorrect amount of users, please try again");
       }
       // try to make something that allows the user to retype their input.

       Scanner names = new Scanner(System.in);
       userNames = new ArrayList<>();
       for (int i = 1; i <= numofUsers ; i++) {
           System.out.println("Please enter user" +i+ " name: ");
           userNames.add(names.next());
       }

       Collections.shuffle(userNames); //will shuffle up the arraylist randomly

       System.out.println("The order in which the users will play is as follows: ");
       for (int i = 0; i < userNames.size(); i++) {
           userTurn = i + 1;
           System.out.print(userNames.get(i));
           System.out.println(" = "+ userTurn);
       }
       System.out.println(userTurn);
   }

}