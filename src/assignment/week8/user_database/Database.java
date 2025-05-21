package assignment.week8.user_database;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Database {
    private static final String databaseFile = "src/assignment/week8/user_database/database.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    Users users;

    public Database() throws IOException {
        users = loadUsers();
    }

    private Users loadUsers() throws IOException {
        if (!Files.exists(Path.of(databaseFile))) {
            Files.createFile(Path.of(databaseFile));
        }
        try (BufferedReader reader = Files.newBufferedReader(Path.of(databaseFile))) {
            return objectMapper.readValue(reader, Users.class);
        }
    }

    public Users getUsers() {
        return users;
    }

    public void addUser(String username, int age, Gender gender) throws IOException {
        User user = new User(username, age, gender);
        users.add(user);
        writeDatabase();
    }

    private void writeDatabase() throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(databaseFile))) {
            objectMapper.writeValue(writer, users);
        }
    }

    public void removeUser(String username) throws IOException {
        users.remove(username);
        writeDatabase();
    }
}
