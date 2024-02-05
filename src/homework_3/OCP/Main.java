package homework_3.OCP;

public class Main {
    public static void main(String[] args) {
        printAllowedSpeed(new Bike(30));
        printAllowedSpeed(new Car(200));
    }
    public static void printAllowedSpeed(Vehicle vehicle) {
        System.out.println(vehicle.type + " allowed speed = " + vehicle.calculateAllowedSpeed() + " km/h");
    }
}