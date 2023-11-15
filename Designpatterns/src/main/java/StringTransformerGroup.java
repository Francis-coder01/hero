import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> transformers;
    public StringTransformerGroup(List<StringTransformer> transformers) {

        this.transformers = transformers;
    }
    @Override
    public void execute(StringDrink drink) {
        for (int i = 0; i < transformers.size(); i++) {
            transformers.get(i).execute(drink);
        }
    }
}
