package step_6_4_subclass_capabilities;

public class MainTest {
    public static void main(String[] args) {
        Parent parent_01 = new Parent();
        Child child_01 = new Child();

        parent_01.show();
        child_01.show();

        Parent parent_02 = new Child();
        //Child child_02 = new Parent();

        parent_02.show();
        //child_02.show();
    }
}
