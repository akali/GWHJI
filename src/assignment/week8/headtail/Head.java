package assignment.week8.headtail;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class Head {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        int number = sc.nextInt();

        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            for (int i = 0; i <number; ++i) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.printf("%d: \t%s\n", i + 1, line);
            }
        } catch (NoSuchFileException e) {
            System.out.printf("File %s not found\n", filename);
            return;
        } catch (IOException e) {
            System.out.printf("Error occurred: %s\n", e.getMessage());
            return;
        }
    }
}
