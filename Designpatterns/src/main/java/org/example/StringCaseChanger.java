package org.example;

public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink){
        StringBuilder caseChanger = new StringBuilder();
        for(int i = 0; i < drink.getText().length(); i++){
            if(Character.isLowerCase(drink.getText().charAt(i))){
                caseChanger.append(Character.toUpperCase(drink.getText().charAt(i)));
            }
            else {
                caseChanger.append(Character.toLowerCase(drink.getText().charAt(i)));
            }
        }
        drink.setText(String.valueOf(caseChanger));
    }
}
