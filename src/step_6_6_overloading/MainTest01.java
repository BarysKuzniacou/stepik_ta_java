package step_6_6_overloading;

public class MainTest01 {
    static void doJob(byte b) {
        System.out.println("byte");
    }

    static void doJob(Byte b) {
        System.out.println("Byte");
    }

    public static void main(String[] args) {
        byte b = 5;
        Byte bb = b;
        doJob(b);
        doJob(bb);
    }
}
