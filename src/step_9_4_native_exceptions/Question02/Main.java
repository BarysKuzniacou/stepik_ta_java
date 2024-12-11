package step_9_4_native_exceptions.Question02;

public class Main extends Abstract {

    static int a,b,c,d;

    @Override
    void method() throws ExceptionTwo {
        throw new ExceptionTwo();
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.method();
            a++;
        }
        catch (ExceptionTwo ex) {
            b++;
        }
        catch (ExceptionOne ex) {
            c++;
        }
        finally {
            d = a + b + c;
        }

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}