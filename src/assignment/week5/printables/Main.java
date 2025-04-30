package assignment.week5.printables;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{
                new Document("Assignment.pdf"),
                new Barcode("0x1134123"),
                new Photo("Gray"),
        };
        for (Printable printable : printables) {
            printable.print();
        }
        PrintQueue.work(printables);
    }
}
