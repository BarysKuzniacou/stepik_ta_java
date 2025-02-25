package step_15_1_code_comments;

//https://www.youtube.com/watch?v=NDypr06h8HU

/**
 *  This is Main class
 * @author boris
 * @version 1.1
 * @since 1.0
 */
public class Main {

    /**
     *  This is main method
     * @param args command line values
     */
    public static void main(String[] args) {
        /**
         * a + b = 5
         */
        int a = 2;
        int b = 3;
        System.out.println(a + b);
        /*
        Комментарии позволяют предоставлять дополнительную информацию о коде и игнорируются компилятором.
        Java-программы имеют два вида комментариев: реализации и документации.
        Утилита javadoc извлекает информацию о пакетах, классах и интерфейсах, объявленных как public; методах,
        объявленных как public / protected; полях, объявленных как public / protected.
        Дескрипторы используются при написании любых комментариев, предназначенных для создания документации.
        Дескрипторы включаются в комментарии документации в следующем порядке: @author, @version, @param, @return,
        @exception, @see, @since, @serial, @deprecated. При этом @param и @return являются обязательными.
         */
    }

    /**
     * This method returns i
     * @param i some int value
     * @throws if something goes wrong this exception wil be thrown
     * @return i from params
     */
    int getField (int i) throws RuntimeException {
        return i;
    }
}
