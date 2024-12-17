package step_10_1_Annotations.Example02_OverrideAnnotation;

public class ChildClass extends ParentClass implements SayHi {
    @Override
    public void printHello() {
        System.out.println("Hello ChildClass");
    }

    @Override
    public void sayHi() {
        System.out.println("Say hi in ChildClass");
    }
}
