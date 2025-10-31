package mod1.lev14_collections.task9_generic;

public class App {
    public static void main(String[] args) {
        ValueObject<Boolean> valueObject = new ValueObject<>(true);
        ValueObject<Integer> integerValueObjectInteger = new ValueObject<>(123);
        ValueObject<Cat> catValueObject = new ValueObject<>(new Cat());

        ValueObject<Number> numberValueObject = new ValueObject<>(224.0);
    }
}
