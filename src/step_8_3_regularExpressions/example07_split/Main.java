package step_8_3_regularExpressions.example07_split;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str1 = "Один два,три!четыре;пять шесть.семь";
        Pattern p1 = Pattern.compile("[ ,!;.]");
        String s[] = p1.split(str1);
        System.out.println("Исходная строка -> " + str1);
        for (String i : s) {
            System.out.println("Лексема: " + i);
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        String str1 = "Один два,три!четыре;пять шесть.семь";
        Pattern p1 = Pattern.compile("[ ,!;.]");
        /*
        Если limit>0 – шаблон будет применен с максимально limit-1 раз, длина массива будет не больше limit, и
        последняя запись массива будет содержать все входные данные, кроме последнего сопоставленного разделителя.
        Если limit<0 – шаблон будет применяться столько раз, сколько возможно, и массив может иметь любую длину.
        Если limit=0 – шаблон будет применяться столько раз, сколько возможно, массив может иметь любую длину, а
        завершающие пустые строки будут отбрасываться.
         */
        String s[] = p1.split(str1, 3);
        System.out.println("Исходная строка -> " + str1);
        for (String i : s) {
            System.out.println("Лексема: " + i);
        }
    }
}
