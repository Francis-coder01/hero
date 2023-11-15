public class StringBar extends Bar{
    private boolean happy_hour = false;
    @Override
    public boolean isHappyHour() {
        return happy_hour;
    }

    @Override
    public void startHappyHour() {
        happy_hour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        happy_hour = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
