package assignment.week8.grep;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class Grep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.next();
        String filename = sc.next();
        int lineNumber = 0;

        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                boolean found = line.contains(pattern);

                if (found) {
                    System.out.printf("Result found: %d %s\n", lineNumber, line);
                }
                lineNumber++;
            }
        } catch (NoSuchFileException e) {
            System.out.printf("File %s not found\n", filename);
        } catch (IOException e) {
            System.out.printf("Error occurred: %s\n", e.getMessage());
        }
    }
}
