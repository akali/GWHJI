package assignment.week8.headtail;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tail {

    static class Line {
        int number;
        String content;

        public Line(int number, String content) {
            this.number = number;
            this.content = content;
        }

        @Override
        public String toString() {
            return String.format("%d\t%s", number, content);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        int number = sc.nextInt();

        List<Line> lines = new LinkedList<>();

        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            for (int i = 0; true; i++) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                if (lines.size() == number) {
                    lines.removeFirst();
                }
                lines.add(new Line(i, line));
            }
            for (Line l : lines) {
                System.out.println(l);
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
