package step_11_1_generics.Example01;

public class Main {
    public static void main(String[] args) {
        // Создаем массив строк
        Array<String> stringArray = new Array<>(3, String.class);
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");
        stringArray.set(2, "Generics");

        System.out.println("String Array:");
        for (int i = 0; i < stringArray.getSize(); i++) {
            System.out.println(stringArray.get(i));
        }

        // Создаем массив чисел Double
        Array<Double> doubleArray = new Array<>(4, Double.class);
        doubleArray.set(0, 1.1);
        doubleArray.set(1, 2.2);
        doubleArray.set(2, 3.3);
        doubleArray.set(3, 4.4);

        System.out.println("\nDouble Array:");
        for (int i = 0; i < doubleArray.getSize(); i++) {
            System.out.println(doubleArray.get(i));
        }
    }
}