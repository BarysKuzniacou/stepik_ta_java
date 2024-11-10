package step_8_1_string_class.example01;

import java.sql.SQLOutput;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();

        System.out.print("ClassA().string = new ClassB().string ? ");
        if (objA.string == objB.string) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.print("ClassA().i = new ClassB().i ? ");
        if (objA.i == objB.i) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        String string01 = "hi";
        String string02 = "hi";

        System.out.print("String string01 \"hi\" = String string02 \"hi\" ? ");
        if (string01 == string02) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //char charAt(int pos)	Получение символа по указанной позиции pos
        System.out.println("Char possition 0: " + string01.charAt(0));

        //String concat(String s) или «+»	Соединение (конкатенация) двух строк
        System.out.println("Concatenate method: " + string01.concat(string02));

        //boolean endsWith(String suffix)	Проверка, заканчивается ли эта строка указанным суффиксом
        System.out.println("Ends with i: " + string01.endsWith("i"));
        System.out.println("Ends with i: " + string02.endsWith("h"));

        //boolean equals(Object ob)	Сравнение двух строк с учетом регистра
        System.out.println("string01 = string02 (method): " + string01.equals(string02));

        //boolean equalsIgnoreCase(String s)	Сравнение двух строк без учета регистра
        String string03 = "HI";
        System.out.println("hi = HI: " + string01.equals(string03));
        System.out.println("hi = HI: " + string01.equalsIgnoreCase(string03));

        /*
        static String format(String format, Object... args)	Получение строки согласно формату,
        указанному первым аргументом, включив в нее все перечисленные данные во втором аргументе
         */

        /*
        void getChars(<параметры>)	Получение символов строки в виде массива двухбайтных значений
         */

        //int indexOf(int ch)	Определение позиции первого вхождения указанного символа в строке
        String string04 = "Abracadabra";
        System.out.println("First A: " + string04.indexOf("a"));

        /*
        String intern()	Добавление строки в пул строк
         */

        //int lastIndexOf(char c)	Определение позиции последнего вхождения указанного символа в строке
        System.out.println("Last A: " + string04.indexOf("A"));

        //int length()	Определение длины строки
        System.out.println("Length 'Abracadabra': " + string04.length());

        //boolean matches(String regex)	Определение соответствия строки указанному регулярному выражению
        String string05 = "Abracadabra";
        System.out.println("Matches 'Abracadabra' to 'aca': " + string04.matches("aca"));
        System.out.println("Matches 'Abracadabra' to 'Abracadabra': " + string04.matches(string05));

        /*
        String repeat(int count)	Возвращение строки, которая представляет собой конкатенацию этой строки,
        повторяющееся указанное количество раз
         */
        System.out.println("Repeat 'hi' 5 times: " + string01.repeat(5));

        //String replace(char c1, char c2)	Замена в строке всех вхождений первого символа вторым символом
        System.out.println("Replace 'a' for 'A' in 'Abracadabra': " + string05.replace("a", "A"));

        /*
        String replaceAll(String regex, String replacement)	Заменяет каждую подстроку этой строки, которая соответствует
        указанному регулярному выражению, на указанную вторым аргументом строку
         */
        System.out.println("Replace 'aca' for 'ABA' in 'Abracadabra': " + string05.replaceAll("aca", "WGQG"));

        //String split(String regex)	Получение массива строк на основе разделителя в виде регулярного выражения
        String string06 = "You are win !";
        String[] stringsArray = string06.split(" ");

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println("Array #" + i + " " + stringsArray[i]);
        }

        //boolean startsWith(String prefix)	Проверка, начинается ли эта строка с указанного префикса
        System.out.println("'You are win !' starts with 'You' is: " + string06.startsWith("You"));
        System.out.println("'You are win !' starts with 'Y' is: " + string06.startsWith("Y"));
        System.out.println("'You are win !' starts with 'W' is: " + string06.startsWith("W"));

        //String substring(int n)	Извлечение из строки подстроки, начиная с позиции n
        System.out.println("Substract from n=3: " + string06.substring(3));
        System.out.println("Substract from n=4: " + string06.substring(4));

        //String substring(int n, int m)	Извлечение из строки подстроки длиной (m-n), начиная с позиции n
        System.out.println("Substract from n=3 m=4: " + string06.substring(3, 4));
        System.out.println("Substract from n=4 m=6: " + string06.substring(4, 6));

        //String toLowerCase()	Преобразование всех символов строки в нижний регистр
        String string07 = "ABRACADABRA";
        System.out.println(string07.toLowerCase());

        //String toUpperCase()	Преобразование всех символов строки в верхний регистр
        System.out.println(string04.toUpperCase());

        //String trim()	Удаление всех пробелов в начале и в конце строки
        String string08 = "     AB RA CA DA BR A  ";
        System.out.println("_" + string08.trim() + "_");

        //static String valueOf(<значение>)	Преобразование переменной базового типа к строке
        double valueDouble = 0.234567;
        System.out.println(valueOf(valueDouble));
    }
}
