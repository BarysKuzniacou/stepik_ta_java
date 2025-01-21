package step_12_1_enums.Example01;

public class Main {
    public static void main(String[] args) {
        Season season01 = Season.WINTER;
        System.out.println(season01.name()); //возвращает значение текущей константы в виде строки символов.
        System.out.println(season01.ordinal()); //возвращает порядковый номер (позицию) текущей константы.

        Season season02 = Season.WINTER;
        System.out.println(season01.equals(season02)); //сравнивает два перечисления одного и того же типа на равенство.
        System.out.println(season01.hashCode()); //возвращает идентификатор текущей константы.
        System.out.println(season02.hashCode());
        System.out.println(season01.toString()); //возвращает описание текущей константы в виде строки

        System.out.println(season01.compareTo(season02));//сопоставляет два перечисления одного и того же типа.
        System.out.println(season01.compareTo(season01));
        Season season03 = Season.SPRING;
        System.out.println(season01.compareTo(season03));
        System.out.println(season01.values());
        /*
        статический values() - возвращает массив всех значений перечисления в порядке их объявления.

        статический valueOf() - возвращает константу перечисления соответствующую указанной строке символов.
         */

    }
}
