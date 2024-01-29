package homework_2.factory_method;

public class GenGoldReward implements GenItem {

    @Override
    public IGameItem create() {
        return new GoldReward();
    }
}
