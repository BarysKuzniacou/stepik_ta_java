package step_11_2_generics_methods.Example02;

public class BoxProvider {
    public <T> Box<T> box(T value) {
        return new Box<>(value);
    }
}
