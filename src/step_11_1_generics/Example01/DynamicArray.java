package step_11_1_generics.Example01;

public class DynamicArray<T> {
    private T[] elements;

    public void addElement(T element) {
        elements[0] = element;
        // ...
    }

    public T getElement(int index) {
        // ...
        return elements[index];
    }
    // ...
}

