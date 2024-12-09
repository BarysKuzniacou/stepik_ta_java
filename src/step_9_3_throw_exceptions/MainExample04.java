package step_9_3_throw_exceptions;

public class MainExample04 {
    public static void main(String[] args) {
        //double d = 0.0;

        try {
            //d = calc(0);
            //System.out.println(d);
            calc(0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            throw new ArithmeticException();
            //System.out.println("ArithmeticException: " + e);;
        }
        /*
        d = calc(0);
        System.out.println(d);
        */
    }

    public static int  calc(int a) throws ArithmeticException {
        return  7 / a;
    }
}
