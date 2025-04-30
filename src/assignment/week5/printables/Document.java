package assignment.week5.printables;

public class Document implements Printable {
    private final String filename;

    public Document(String filename) {
        this.filename = filename;
    }
    @Override
    public void print() {
        System.out.println("Printing document: " + filename);
    }
}

