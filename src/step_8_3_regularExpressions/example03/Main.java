package step_8_3_regularExpressions.example03;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*
        Pattern pattern = Pattern.compile("abc");

        String s1;
        s1 = Pattern.pattern();

        System.out.println();
        */
        System.out.println(Pattern.matches("А.+а","Алла"));
        System.out.println(Pattern.matches("А.+а","Егор Алла Александр"));

        Pattern pattern = Pattern.compile("abc");
        System.out.println(pattern.flags());
        pattern = Pattern.compile("abc",Pattern.CASE_INSENSITIVE);
        System.out.println(pattern.flags());
    }
}
