package step_11_2_generics_methods.Example02;

public class Box<T> {
private T value;

public Box(T value) {
    this.value = value;
}

public static <V> Box<V> box(V value) {
    return new Box<>(value);
}
}
