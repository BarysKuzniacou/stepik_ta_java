package step_11_1_generics.Example02;

public class Main {
    public static void main(String[] args) {
        KeyValueImpl<Integer, String> element = new KeyValueImpl<>(1, "Aa");
        System.out.println("Key: " + element.getKey() + ", Value: " + element.getValue());;
    }
}
