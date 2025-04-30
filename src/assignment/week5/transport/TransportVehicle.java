package assignment.week5.transport;

public abstract class TransportVehicle {
    protected String name;
    protected int speed;

    protected int position;

    public TransportVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.position = 0;
    }

    void start() {
        System.out.println(name + " started");
    }

    abstract void move();
}
