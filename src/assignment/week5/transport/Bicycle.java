package assignment.week5.transport;

public class Bicycle extends TransportVehicle {

    public Bicycle(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        this.position += this.speed;
        System.out.println(name + " moved to " + this.position);
    }
}
