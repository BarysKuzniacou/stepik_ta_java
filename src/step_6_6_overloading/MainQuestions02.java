package step_6_6_overloading;

public class MainQuestions02 {
    static void doJob(Integer num) {
        System.out.println("Integer");
    }
    static void doJob(Object obj) {
        System.out.println("Object");
    }
    static void doJob(int number) {
        System.out.println("int");
    }
    public static void main(String[] args) {
        Object object = 10;
        doJob(object);
    }
}
