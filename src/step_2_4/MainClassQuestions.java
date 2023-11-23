package step_2_4;
/*
Постфикс	() [] . (точка)	Слева направо
Унарный	++ -- ! ~	Справа налево
Мультипликативный	* / %	Слева направо
Аддитивный	+ -	Слева направо
Сдвиг	>> >>> <<	Слева направо
Реляционный	> >= < <=	Слева направо
Равенство	== !=	Слева направо
Побитовое "И" ("AND")	&	Слева направо
Побитовое исключающее "ИЛИ" ("XOR")	^	Слева направо
Побитовое "ИЛИ" ("OR")	|	Слева направо
Логическое "И" ("AND")	&&	Слева направо
Логическое "ИЛИ"("OR")	||	Слева направо
Тернарный (условный)	?:	Справа налево
Присваивание	= += -= *= /= %= >>= <<= &= ^= |=	Справа налево
Запятая	,	Слева направо
 */
public class MainClassQuestions {
    public static void main(String[] args) {
        System.out.println(12345 + 5432l);

        System.out.println("2 + 2 = " + 2 + 2);

        int a = 10;
        int b = 20;
        System.out.println(! (b > 10));
        System.out.println(! (a > 20));
        System.out.println(a > 20 || b > 10);
        System.out.println(a > 20 && b > 10);

        String s = "Hello";
        long l = 99;
        double d = 1.11;
        int i = 1;
        int j = 0;
        /*
        j = i << s;
        j = i << d;
        */
        j = i << l;
        j = i << j;

        System.out.println(010 | 4);

        int valueInt = 34_567;
        short valueShort = (short) valueInt;
        System.out.println(valueInt + " -> " + valueShort);

        double valDouble = 1.0e-46;
        float valFloat = (float) valDouble;
        System.out.println(valDouble + " -> " + valFloat);

        final byte b1 = 5;
        byte b2 = b1 + 10;

        byte b3 = 50;
        int iVal = -100;
        b3 += iVal--;

        /*
        double d = 555d;

        int i = 1 / 3;

        float f = 1 / 2;

        float f = 1.45;
         */

        long x = 5;
        long y = 2;
        //byte b = (byte) x / y;
    }
}
