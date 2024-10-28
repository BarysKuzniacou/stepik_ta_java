package step_7_2_interface.example03;

public class Main {
    public static void main(String[] args) {
        ClassImplements object = new ClassImplements();

        System.out.println(object.getVariable());

        System.out.println(((Interface02)object).getVariable());

        System.out.println(((Interface01)object).variable);

        System.out.println(Interface02.variable);

    }
}
