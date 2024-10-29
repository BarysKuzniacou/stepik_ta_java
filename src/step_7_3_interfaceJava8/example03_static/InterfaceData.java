package step_7_3_interfaceJava8.example03_static;

public interface InterfaceData {
    default void print(String str) {
        if ( !isNull(str) ) {
            System.out.println("[InterfaceData] Data. Prints lines: " + str);
        }
    }
    static boolean isNull(String str) {
        System.out.println("[InterfaceData] Static method null checking ");
        return str == null ? true : "".equals(str.trim()) ? true : false;
    }
}
