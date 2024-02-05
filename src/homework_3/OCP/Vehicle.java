package homework_3.OCP;

public abstract class Vehicle {
    public String type;
    public int maxSpeed;

    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    public abstract int calculateAllowedSpeed();
}
