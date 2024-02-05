package homework_3.DIP;

public class Main {
    public static void main(String[] args) {
        new Car(new ElectricEngine()).start();
        new Car(new PetrolEngine()).start();
    }
}
