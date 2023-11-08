package org.example;

public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder inverted = new StringBuilder(drink.getText());
        drink.setText(String.valueOf(inverted.reverse()));
    }
}
