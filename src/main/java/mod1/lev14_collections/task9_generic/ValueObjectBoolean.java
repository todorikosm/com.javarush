package mod1.lev14_collections.task9_generic;

public class ValueObjectBoolean {

    private Boolean value;

    public ValueObjectBoolean(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueObjecrBoolean{" +
                "value=" + value +
                '}';
    }
}
