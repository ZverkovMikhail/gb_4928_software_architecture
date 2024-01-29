package homework_2.factory_method;

public class GenGarbageReward implements GenItem {
    @Override
    public IGameItem create() {
        return new GarbageReward();
    }
}
