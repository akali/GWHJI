package week5.examples.interfaces;

public class Circle extends Shape {

    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    double area() {
        return 2 * 3.14 * radius;
    }
}
