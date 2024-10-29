package step_7_3_interfaceJava8.example01_default;

public class Plane implements FlyingMachine {
    @Override
    public void blastOff() {
        System.out.println("The plane is blasting off");
    }
    @Override
    public void landing() {
        System.out.println("The plane is landing");
    }
}
