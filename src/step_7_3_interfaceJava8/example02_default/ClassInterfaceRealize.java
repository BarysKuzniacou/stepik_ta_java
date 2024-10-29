package step_7_3_interfaceJava8.example02_default;

public class ClassInterfaceRealize implements Interface01, Interface02 {
    @Override
    public void log(String str) {
        System.out.println("ClassInterfaceRealize: " + str);
    }
}
