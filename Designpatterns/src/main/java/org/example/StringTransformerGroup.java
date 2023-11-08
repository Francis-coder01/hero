package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> recipe;
    public StringTransformerGroup(List<StringTransformer> r){
        recipe = r;
    }
    public void execute(StringDrink drink){
        for (StringTransformer stringTransformer : recipe) {
            stringTransformer.execute(drink);
        }
    }
}
