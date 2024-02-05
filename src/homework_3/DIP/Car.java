package homework_3.DIP;

public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
