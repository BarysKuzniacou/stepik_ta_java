package step_9_2_exception_handling;

public class MainQuestion03 {
    public static void main(String[] args)  {
        try  {
            method();
        } catch (StackOverflowError e)  {
            for (int i=0; i<2; ++i) {
                System.out.print(i);
            }
        }
    }
    public static void method() {
        method();
    }
}
