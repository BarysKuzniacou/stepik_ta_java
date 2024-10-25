package step_6_5_polymorphism.information_02.InsurancePackage;

public class Main {
    public static void main(String[] args) {
        Insurance current = new CarInsurance();
        System.out.println("category: " + current.getCategory());
        System.out.println("category: " + CarInsurance.getCategory());
    }
}
