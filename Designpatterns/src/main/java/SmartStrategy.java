import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class SmartStrategy implements OrderingStrategy{
    private class Order {
        private final StringDrink drink;
        private final StringRecipe recipe;
        public Order(StringDrink drink, StringRecipe recipe){
            this.drink = drink;
            this.recipe = recipe;
        }
    }
    private boolean happyHour = false;
    private final HashMap<StringBar,List<Order>> orders = new HashMap<>();
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        orders.get(bar).add(new Order(drink,recipe));
        getDrunk(bar);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        happyHour = true;
        getDrunk(bar);
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        happyHour = false;
    }

    public void getDrunk(StringBar bar){
        while(happyHour && !orders.isEmpty()){
            bar.order(orders.get(bar).get(0).drink, orders.get(bar).get(0).recipe);
            orders.get(bar).remove(0);
        }
    }
}
