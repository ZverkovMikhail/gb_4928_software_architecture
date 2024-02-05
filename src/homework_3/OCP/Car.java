package homework_3.OCP;

public class Car extends Vehicle{

    public Car(int maxSpeed) {
        super("Car", maxSpeed);
    }

    @Override
    public int calculateAllowedSpeed() {
        return (int) (this.maxSpeed * 0.8);
    }
}
