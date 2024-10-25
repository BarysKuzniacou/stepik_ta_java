package step_6_6_overloading;

public class MainTest02 {
    static void doJob(byte b) {
        System.out.println("byte");
    }

    static void doJob(int i) {
        System.out.println("int");
    }

    static void doJob(double d) {
        System.out.println("double");
    }

    public static void main(String[] args) {
        short s = 10;
        long x = s;
        double dd = s;
        doJob(s);
        doJob(x);
        doJob(dd);
    }
}
