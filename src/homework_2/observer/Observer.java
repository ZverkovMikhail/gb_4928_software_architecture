package homework_2.observer;

public class Observer implements IObserver{
    private String name;
    public Observer(String name){
        this.name = name;
    }
    @Override
    public void update(String msg) {
        System.out.println(this.name + "::update -> " + msg);
    }
}
