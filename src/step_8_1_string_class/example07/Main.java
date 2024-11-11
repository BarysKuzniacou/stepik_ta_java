package step_8_1_string_class.example07;

public class Main {
    public static void main(String[] args) {
        /*
        regionMatches() - данный метод выполняет сравнение определенных подстрок в пределах двух строк.

        Этот метод имеет две формы:

        Форма 1: boolean regionMatches(int toffset, String other, int oofset, int len)

        Форма 2: boolean regionMatches(boolean ignoreCase, int toffset, String other, int oofset, int len), где

        ignoreCase: флаг, указывающий, что можно не учитывать регистр символов при сравнении (если флаг имеет значениеtrue, то регистр не учитывается)
        toffset: индекс, с которого начинается сравнение в строке, из которой мы вызываем этот метод
        other: строка, с которой сравнивается вызывающая строка
        oofset: индекс, с которого начинается сравнение в строке, с которой сравниваем
        len: количество символов, которые будут сравниваться в двух строках.
         */

        String str1 = "Learn jAVA";
        String str2 = "Cool AVAtar!";
        boolean result = str1.regionMatches(7, str2, 5, 3);
        System.out.println(result);
    }
}
