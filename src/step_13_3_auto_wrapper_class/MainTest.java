package step_13_3_auto_wrapper_class;

public class MainTest {
    static Integer x;
    public static void main(String[] args) {
        doStuff(x);
    }
    static void doStuff(int z) {
        int z2 = 5;
        System.out.println(z2 + z);
    }
}
