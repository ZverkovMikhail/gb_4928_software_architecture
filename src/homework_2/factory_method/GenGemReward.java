package homework_2.factory_method;

public class GenGemReward implements GenItem {
    @Override
    public IGameItem create() {
        return new GemReward();
    }
}
