package step_8_3_regularExpressions.example05_matches;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("J.+a");
        System.out.println(Pattern.matches("J.+a","Java"));
        System.out.println(Pattern.matches("J.+a","Java JavaScript"));
    }
}
