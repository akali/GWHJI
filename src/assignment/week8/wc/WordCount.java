package assignment.week8.wc;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        int wordCount = 0;

        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] strings = line.split(" ");
                for (String s : strings) {
                    if (!s.isEmpty()) {
                        wordCount++;
                    }
                }
            }
        } catch (NoSuchFileException e) {
            System.out.printf("File %s not found\n", filename);
            return;
        } catch (IOException e) {
            System.out.printf("Error occurred: %s\n", e.getMessage());
            return;
        }

        System.out.printf("%d words found\n", wordCount);
    }
}
