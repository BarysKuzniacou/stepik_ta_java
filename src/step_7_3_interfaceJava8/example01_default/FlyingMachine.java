package step_7_3_interfaceJava8.example01_default;

public interface FlyingMachine {
    void blastOff();
    void landing();

    default void makeTravel() {
        blastOff();
        fly();
        landing();
    }

    default void fly() {
        System.out.println("Machine is flying!");
    }
}
