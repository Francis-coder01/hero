package org.example;

import java.util.List;
import java.util.ListIterator;

public class StringRecipe {
    List<StringTransformer> RecipeList;
    public StringRecipe(List<StringTransformer> list){
        RecipeList = list;
    }
    public void add(StringTransformer s){
        RecipeList.add(s);
    }
    public void mix(StringDrink drink){
        for (StringTransformer stringTransformer : RecipeList) {
            stringTransformer.execute(drink);
        }
    }
}
