package assignment.week8.user_database;

import java.util.HashSet;
import java.util.Set;

public class Users {
    Set<User> users;

    public Users() {
        users = new HashSet<>();
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Users(Set<User> users) {
        this.users = users;
    }

    public void add(User user) {
        users.add(user);
    }

    public void remove(String username) {
        users.removeIf(user -> user.getName().equals(username));
    }
}
