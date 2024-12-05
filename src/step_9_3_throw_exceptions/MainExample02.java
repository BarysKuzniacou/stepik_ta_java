package step_9_3_throw_exceptions;

public class MainExample02 {
    public static void main(String[] args) {
        try {
            testExcp();
        } catch(Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
    public static void testExcp() {
        //throw new Exception("test"); // проверяемое исключение
    }
}
