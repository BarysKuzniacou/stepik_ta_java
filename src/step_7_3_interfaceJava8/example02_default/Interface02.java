package step_7_3_interfaceJava8.example02_default;

public interface Interface02 {
    default public void log(String str) {
        System.out.println("Log Interface01: " + str);
    }
}
