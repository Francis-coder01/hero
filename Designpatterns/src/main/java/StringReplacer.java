public class StringReplacer implements StringTransformer{
    private char old;
    private char new_ch;
    public StringReplacer(char old, char newst) {
        this.old = old;
        this.new_ch = newst;
    }
    @Override
    public void execute(StringDrink drink) {
        String some = drink.getText();
        String res = new String("");
        for (int i = 0; i < some.length(); i++) {
            if (some.charAt(i) == this.old) {
                res += this.new_ch;
            }
            else res += (some.charAt(i));
        }
        drink.setText(res);
    }
}
