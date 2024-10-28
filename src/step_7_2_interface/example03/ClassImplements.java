package step_7_2_interface.example03;

public class ClassImplements implements Interface01, Interface02{
    @Override
    public String getVariable() {
        System.out.println("Interface01: " + Interface01.variable
                + ", Interface02: " + Interface02.variable);
        return "work ClassImplements";
    }
}
