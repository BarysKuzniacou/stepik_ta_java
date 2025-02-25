package step_14_2_optional_methods;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
        Метод get() используется для получения значения из объекта Optional. Однако он является небезопасным, так как
        может бросить исключение NoSuchElementException, если значение null. Поэтому прежде, чем получать значение,
        лучше проверить его наличие.
        Проверить наличие значения в объекте Optional можно методом isPresent(): если объект пустой, то возвращается
        значение false.
         */
        Optional name01 = Optional.of("John");
        if (name01.isPresent()) {
            System.out.println(name01.get());
        }

        Optional name02 = Optional.of("Brett");
        name02.ifPresent(System.out::println);

        /*
        Метод orElse() возвращает переданное значение, если в объекте Optional не содержится значение, то есть он
        пустой. Иначе возвращается содержащееся значение.
         */
        Optional name03 = Optional.empty();
        System.out.println(name03.orElse("Blank"));
        Optional name04 = Optional.of("Marta");
        System.out.println(name04.orElse("Blank"));

        /*
        Метод orElseGet() возвращает значение, вырабатываемое переданным объектом типа Supplier, если объект Optional
        пустой. Иначе возвращается содержащееся значение. Например, в этом примере, если в Optional будет содержаться
        null, вернется пустая строка, так как Supplier предлагает обращение к конструктору по умолчанию класса String.
         */
        Optional name05 = Optional.of("Adam");
        System.out.println(name05.orElseGet(String::new));
        Optional name06 = Optional.empty();
        System.out.println(name06.orElseGet(String::new));
        System.out.println("выше пустая строка");

        /*
        Метод orElseThrow() бросает исключение типа NoSuchElementException или же исключение, которое вырабатывается
        переданным объектом типа Supplier, если объект Optional пустой. Иначе возвращается содержащееся значение.
        Например, в этом примере будет выброшена ошибка NoSuchElementException, так как Optional содержит пустой объект.
         */
        Optional empty = Optional.empty();
        //Object emptyValue = empty.orElseThrow();
        System.out.println(empty.orElseThrow());

    }
}
