package step_11_1_generics.Example01;

public class Array<T> {
    private T[] array;
    private int size;

    // Конструктор
    @SuppressWarnings("unchecked")
    public Array(int size, Class<T> clazz) {
        this.size = size;
        // Создаем массив нужного типа с использованием рефлексии
        this.array = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
    }

    // Метод для добавления элемента
    public void set(int index, T value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }

    // Метод для получения элемента
    public T get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }

    // Метод для получения всего массива
    public T[] getArray() {
        return array;
    }

    // Метод для получения размера массива
    public int getSize() {
        return size;
    }
}
