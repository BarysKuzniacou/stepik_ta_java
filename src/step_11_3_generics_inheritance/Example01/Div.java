package step_11_3_generics_inheritance.Example01;

public class Div <T extends Number> {
    private T x;
    private T y;

    Div(T a, T b) {
        x = a;
        y = b;
    }
    public int perform() {
        return (int)(x.doubleValue() / y.doubleValue());
    }
}
