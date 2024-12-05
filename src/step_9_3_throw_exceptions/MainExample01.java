package step_9_3_throw_exceptions;

public class MainExample01 {
    static void testG() {
        try {
            throw new ClassCastException("Demo");
        } catch (ClassCastException  exp) {
            System.out.println("Exception in method!");
            throw exp;
        }
    }
    public static void main(String[] args) {
        try {
            testG();
        } catch (ClassCastException e) {
            System.out.println("Exception of method!");
        }
    }
}
