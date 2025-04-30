package assignment.week5.transport;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Andrew's bicycle", 15);
        Train train = new Train("Shinkansen", 500);

        bicycle.start();
        train.start();

        for (int i = 0; i < 15; ++i) {
            bicycle.move();
            train.move();
        }
    }
}
