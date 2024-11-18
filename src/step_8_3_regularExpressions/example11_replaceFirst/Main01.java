package step_8_3_regularExpressions.example11_replaceFirst;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main01 {
    public static void main(String[] args) {
        String text = "This is my second java 45 project.\n" +
                "It is wonderful to learn polysemantics and arrays.\n" +
                "The weather is cold like it should be in winter, but we are all looking forward to spring.";
        System.out.println("Before:\n" + text);
        Pattern p = Pattern.compile("\\b[\\w]{2}\\b");
        Matcher m = p.matcher(text);
        /*
        Метод replaceFirst(String replacement) работает следующим образом: во входной последовательности заменяется
        первая подпоследовательность, совпадающая с шаблоном, на параметр replacement.

        В описанном примере будет заменена только первая последовательность из 2 символов.
         */
        text = m.replaceFirst("lab2");
        System.out.println("\nAfter:\n" + text);
    }
}
