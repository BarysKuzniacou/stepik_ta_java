package step_7_3_interfaceJava8.example03_static;

public class ClassData implements InterfaceData {
    public boolean isNull(String str) {
        System.out.println("[ClassData] Null check ");
        return str == null;
    }
}
