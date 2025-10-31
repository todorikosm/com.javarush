package mod1.lev14_collections.task9;

public class ValueObject<T> {

    private T value;

    public ValueObject(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
