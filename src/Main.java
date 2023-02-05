public class Main {
    public static void main(String[] args) {
        User[] array = new User[2];
        array [0] = new User("Salman", 1);
        array [1] = new User("Zeina", 2);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getUsername() + ", " + array[i].getUserTurn());
        }

    }
}