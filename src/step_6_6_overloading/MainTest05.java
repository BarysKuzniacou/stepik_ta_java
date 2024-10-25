package step_6_6_overloading;

public class MainTest05 {
    static void doJob(String s) {
        System.out.println("String");
    }
    static void doJob(String s1, String s2) {
        System.out.println("String, String");
    }
    static void doJob(String s1, String... str) {
        System.out.println("String, String...");
    }
    public static void main(String[] args) {
        doJob("hi");
        doJob("hi", "hi");
        doJob("hi", "hi", "hi");
    }
}
