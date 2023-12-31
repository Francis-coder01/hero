import java.util.List;

public class HumanClient implements Client {
    private final OrderingStrategy strategy;
    public HumanClient(OrderingStrategy strategy){
        this.strategy = strategy;
    }
    @Override
    public void happyHourStarted(Bar bar) {

    }

    @Override
    public void happyHourEnded(Bar bar) {

    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink,recipe,bar);
    }
}
