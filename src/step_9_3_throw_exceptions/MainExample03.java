package step_9_3_throw_exceptions;

public class MainExample03 {
    public static void main(String[] args) {
        try {
            testExcp();
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void testExcp() {
        throw new RuntimeException("test"); // непроверяемое исключение
    }
}
