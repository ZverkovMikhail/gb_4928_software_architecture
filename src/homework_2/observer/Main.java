package homework_2.observer;

public class Main {
    public static void main(String[] args) {

        EventManager eventManager = new EventManager();

        Observer observer1 = new Observer("Observer1");
        Observer observer2 = new Observer("Observer2");

        eventManager.addListener(observer1);
        eventManager.addListener(observer2);

        eventManager.run();

        eventManager.startEvent();
        eventManager.startEvent();

        eventManager.removeListener(observer1);
        eventManager.startEvent();
    }
}