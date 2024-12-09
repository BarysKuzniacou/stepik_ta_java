package step_9_3_throw_exceptions;

public class MainExample02 {
    public static void main(String[] args) {
        try {
            testExcp();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void testExcp() {
        //throw new Exception("test"); // проверяемое исключение - есть ошибка
        /*
        Exception относится к проверяемым и требуется явно указать, где находится его обработчик.
         */
    }
}
