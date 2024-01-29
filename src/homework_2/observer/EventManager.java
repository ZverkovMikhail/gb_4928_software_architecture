package homework_2.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<IObserver> observers = new ArrayList<>();
    private int count = 0;

    private void event(String msg){
        observers.forEach(IObserver -> IObserver.update(msg));
    }
    public void addListener(IObserver observer) {
        this.observers.add(observer);
    }
    public void removeListener(IObserver observer) {
        this.observers.remove(observer);
    }
    public void run(){
        this.event("EventManager is running!");
    }
    public void startEvent(){
        this.event("EventManager event #" + ++count);
    }
}
