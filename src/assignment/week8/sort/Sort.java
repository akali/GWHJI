package assignment.week8.sort;

import assignment.week8.headtail.Tail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        String writeFilename = sc.next();

        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                for (String s : line.split(" ")) {
                    if (s.isEmpty()) continue;
                    strings.add(s);
                }
            }
            Collections.sort(strings);
            try (BufferedWriter writer = Files.newBufferedWriter(Path.of(writeFilename))) {
                for (String string : strings) {
                    writer.write(String.format("%s ", string));
                }
                writer.flush();
                System.out.printf("Wrote %d files to %s", strings.size(), writeFilename);
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
