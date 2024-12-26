package step_11_2_generics_methods.Example02;

public class Main {
    public static void main(String[] args) {
        Box<String> box1 = Box.<String>box("1"); // a box with String
        Box<Integer> box2 = new BoxProvider().<Integer>box(2); // a box with Integer
    }
}
