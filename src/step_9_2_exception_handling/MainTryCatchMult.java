package step_9_2_exception_handling;

public class MainTryCatchMult {
    public static void main(String[] args) {
        try {
            int b = 0;
            int a = 42 / b;
        /*
        Обработка с множеством catch. Могут быть вложенные структуры
        } catch (ArithmeticException e) {

            System.out.println("Потомок");
        } catch (Exception e) {
            System.out.println("Родитель");
        }
         */
        // обработка более одного исключения в одном catch
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        }
    }
}
