package step_6_5_polymorphism.information_02.QuestionPackage;

public class MainClassAB {
    public static void main(String[] args) {
        ClassA a = new ClassB();
        System.out.println(a.version + " " + a.testMethod());
    }
}
