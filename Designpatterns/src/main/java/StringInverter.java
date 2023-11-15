public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder test = new StringBuilder();
        test.append(drink.getText());
        test.reverse();
        drink.setText(String.valueOf(test));
    }
}
