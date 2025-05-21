package assignment.week8.cat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> filenames = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            filenames.add(sc.next());
        }
        String writeFilename = sc.next();

        for (String filename : filenames) {
            try {
                byte[] bytes = Files.readAllBytes(Path.of(filename));
                String s = new String(bytes);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(writeFilename, true))) {
                    writer.write(s);
                    writer.write("\n");
                    writer.flush();
                }
            } catch (NoSuchFileException e) {
                System.out.printf("File %s not found\n", filename);
            } catch (IOException e) {
                System.out.printf("Error occurred: %s\n", e.getMessage());
            }
        }
    }
}
