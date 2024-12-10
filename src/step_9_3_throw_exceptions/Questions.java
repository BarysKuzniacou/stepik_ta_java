package step_9_3_throw_exceptions;

public class Questions {
    /*
    Перечислите верные утверждения о переопределении метода с компонентом throws в сигнатуре.

    Переопределенный метод подкласса может указать более узкое исключение (подкласс), чем метод его суперкласса
    Переопределенный метод подкласса может не указывать компонент throws
     */

    /*
    Что будет результатом следующего кода?

    public class OverAndOver {
        static  String s = "";
        public static void main(String[] args) {
            try  {
                s += "1";
                throw new Exception();
            }  catch (Exception e) {
                s += "2";
            }  finally {
                s += "3";
                doStuff();
                s += "4";
            }
            System.out.println(s);
        }
        static void doStuff() {
            int x = 0;
            int y = 7 / x;
        }
    }

    Только вывод информации об исключении
     */

    /*
    Какое объявление метода ioRead() должно быть использовано вместо комментария, чтобы компиляция и выполнение кода прошли успешно?

    import java.io.*;
    public class Quest {
        //declaring ioRead()
        public static void main(String[] args) {
            try {
                ioRead();
            } catch (IOException e){}
        }
    }

    Сигнатура метода должна содержать инструкцию throws IOException, иначе возникнет ошибка компиляции.
    private static void ioRead() throws IOException{}
     */
}
