package step_11_4_generics_wildcard.Example01;

public class Demo {
    public static void main(String[] args) {
        Div<Integer> d_1 = new Div<>(10, 20);
        Div<Double> d_2 = new Div<>(5.5, 1.1);
        boolean res = d_1.equalsDiv(d_2);
        System.out.println(res);
    }
}
