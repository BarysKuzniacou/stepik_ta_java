package step_9_4_native_exceptions.Question03;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B extends A {
    //public void f() throws FileNotFoundException, InternalError {}; //+

    //public void f() throws IOException, FileNotFoundException {}; //+

    //public void f() throws IOException {}; //+

    //public void f() throws FileNotFoundException {}; //+

    //public void f() throws InterruptedException, IOException {};

    //public void f() throws Exception {};

    /*
    Переопределяемый метод в подклассе не может содержать в инструкции throws исключений, не обрабатываемых в
    соответствующем методе суперкласса. Это относится только к checked-исключениям.
     */
}
