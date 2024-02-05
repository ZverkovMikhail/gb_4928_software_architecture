package homework_3.OCP;

public class Bike extends Vehicle{
    public Bike(int maxSpeed) {
        super("Bike", maxSpeed);
    }
    @Override
    public int calculateAllowedSpeed() {
        return this.maxSpeed;
    }
}
