package step_8_3_regularExpressions.example01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*
        Pattern pattern = Pattern.compile("jAvA", Pattern.CASE_INSENSITIVE);
        System.out.println(pattern);
         */

        System.out.println("\\d{3}");

        int i = 0;
        String text = "Егор Алла Александр";
        Pattern pattern = Pattern.compile("А.+а");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
            System.out.println(i++);
        }

        i=0;
        pattern = Pattern.compile("А.++а");
        matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
            System.out.println(i++);
        }

        i=0;
        pattern = Pattern.compile("А.+?а");
        matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
            System.out.println(i++);
        }
    }
}
