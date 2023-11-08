package org.example;

public class StringReplacer implements StringTransformer{
    Character toReplace;
    Character newCharacter;
    public StringReplacer(Character a, Character b){
        toReplace = a;
        newCharacter = b;
    }
    @Override
    public void execute(StringDrink drink){
        drink.setText(drink.getText().replace(toReplace,newCharacter));
    }
}
