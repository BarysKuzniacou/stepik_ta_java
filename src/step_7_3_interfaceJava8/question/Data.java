package step_7_3_interfaceJava8.question;

public interface Data {
    default void print(String str) {
        if ( !isNull(str) ) {
            System.out.println("Data: " + str);
        }
    }
    static boolean isNull(String str) {
        return str == null ? true : "".equals(str.trim()) ? true : false;
    }
}
