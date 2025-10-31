package mod1.lev14_collections.task9;

public class ValueObjectInteger {

    private String value;

    public ValueObjectInteger(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueObjectInteger{" +
                "value='" + value + '\'' +
                '}';
    }
}
