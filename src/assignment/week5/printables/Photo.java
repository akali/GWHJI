package assignment.week5.printables;

public class Photo implements Printable {
    private String color;

    public Photo(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Photo printed in " + color);
    }
}
