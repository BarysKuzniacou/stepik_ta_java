package step_6_6_overloading;

public class MainTest03 {
    static void doJob(String s) {
        System.out.println("String");
    }

    static void doJob(Object o) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        String str = "abcd";
        Object obj = str;
        doJob(str);
        doJob(obj);
    }
}
