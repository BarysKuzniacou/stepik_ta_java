package step_6_6_overloading;

public class MainTest06 {
    static void doJob(String... ss) {
        System.out.println("String...");
    }
    static void doJob(String s1, String s2) {
        System.out.println("String, String");
    }
    static void doJob(String s1, String... str) {
        System.out.println("String, String...");
    }
    public static void main(String[] args) {
        /*
        doJob("hi");
        conflict 1, 3
         */
        doJob("hi", "hi");
        /*
        doJob("hi", "hi", "hi");
        conflict 1, 3
         */
    }
}
