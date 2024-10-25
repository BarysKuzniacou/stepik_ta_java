package step_7_1_abstract.example01;

public class Boa extends Reptile {
    public static int num;

    Boa() {
       num++;
    }

    @Override
    public void move() {
        System.out.println("move " + getClass());
    }

    public void speak() {
        System.out.println("shhh " + getClass());
    }
}
