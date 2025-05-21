package assignment.week8.user_database;

import java.io.IOException;
import java.util.Scanner;

public class UserDatabase {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Database db = new Database();

        while (true) {
            String command = sc.next();

            if ("lu".equals(command)) {
                Users users = db.getUsers();
                for (User user : users.getUsers()) {
                    System.out.println(user);
                }
            } else if ("au".equals(command)) {
                String username = sc.next();
                int age = sc.nextInt();
                Gender gender = Gender.of(sc.next());

                db.addUser(username, age, gender);
                System.out.printf("User with username=%s added\n", username);
            } else if ("du".equals(command)) {
                String username = sc.next();
                db.removeUser(username);
                System.out.printf("User with username=%s removed\n", username);
            } else if ("exit".equals(command)) {
                System.out.println("Bye!");
                break;
            }
        }
    }
}
