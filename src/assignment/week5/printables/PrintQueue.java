package assignment.week5.printables;

public class PrintQueue {
    public static void work(Printable[] printables) {
        for (int i = printables.length - 1; i >= 0; --i) {
            printables[i].print();
        }
    }
}
