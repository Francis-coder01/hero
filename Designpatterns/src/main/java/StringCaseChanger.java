public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String some = drink.getText();
        String res = new String("");
        for (int i = 0; i < some.length(); i++) {
            if (Character.isLowerCase(some.charAt(i))) {
                res += Character.toUpperCase(some.charAt(i));
            }
            else res += Character.toLowerCase(some.charAt(i));
        }
        drink.setText(res);
    }
}
