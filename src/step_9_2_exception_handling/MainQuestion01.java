package step_9_2_exception_handling;

public class MainQuestion01 {
    public static void main(String[] args) {
        int a = 10;
        String name = null;
        try {
            a = name.length();
            a++;
        }  catch (RuntimeException e) {
            ++a;
        }
        System.out.println(a);
    }
}
