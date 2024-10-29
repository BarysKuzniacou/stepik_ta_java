package step_7_3_interfaceJava8.example01_default;

public class Main {
    public static void main(String[] args) {
        FlyingMachine plane = new Plane();
        System.out.println("---------FLY---------");
        plane.fly();
        System.out.println("---------TRAVEL---------");
        plane.makeTravel(); /*
                            blastOff();
                            fly();
                            landing();
                            */
        System.out.println("---------BLASTOFF---------");
        plane.blastOff();
        System.out.println("---------LANDING---------");
        plane.landing();
    }
}
