package step_6_6_overloading;

public class MainTest04 {
    static void doJob(int i) {
        System.out.println("int");
    }

    static void doJob(Double d) {
        System.out.println("Double");
    }

    public static void main(String[] args) {
        byte b = 5;
        Byte bb = b;
        doJob(b);
        doJob(bb);
    }
}
