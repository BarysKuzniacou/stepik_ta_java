package step_8_1_string_class.example08;

public class Main {
    public static void main(String[] args) {
        /*
        Методы int compareTo(String anotherString) и int compareToIgnoreCase(String str) позволяют сравнить две строки.
        Также результаты этих методов могут ответить на вопрос, какая из двух строк больше в лексикографическом порядке,
        а какая меньше:

        если метод возвращает значение больше 0, то исходная строка больше
        если метод возвращает значение меньше 0, то наоборот, полученная строка больше.
        Лексикографический порядок означает, например, что строка "A" меньше, чем строка "B", так как символ 'A' в
        алфавите стоит перед символом 'B'. Если первые символы строк равны, то в расчет берутся следующие символы.

        Указанные методы используются при проведении операций сортировки строк.
         */

        String str1 = "JavaDoc";
        String str2 = "World";
        String str3 = "Java";
        String str4 = "javaDoc";
        String str5 = "a";
        String str6 = "b";
        String str7 = "c";
        String str8 = "A";

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));
        System.out.println(str5.compareTo(str6));
        System.out.println(str5.compareTo(str7));
        System.out.println(str5.compareTo(str8));
    }
}
