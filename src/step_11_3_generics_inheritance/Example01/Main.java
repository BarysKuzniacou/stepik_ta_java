package step_11_3_generics_inheritance.Example01;

public class Main {
    public static void main(String[] args) {
        double aD = Math.random() * 100;
        double bD = Math.random() * 100;
        short aS = (short)(Math.random() * 100);
        short bS = (short)(Math.random() * 100);

        Div<Double> divD = new Div<>(aD, bD);
        Div<Short> divS = new Div<>(aS, bS);

        System.out.println(aD + " : " + bD + " = " + divD.perform());
        System.out.println(aS + " : " + bS + " = " + divS.perform());
    }
}
