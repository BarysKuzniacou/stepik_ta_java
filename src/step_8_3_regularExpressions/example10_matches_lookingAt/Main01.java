package step_8_3_regularExpressions.example10_matches_lookingAt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main01 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w*");
        Matcher m = p.matcher("Thanksw!");
        System.out.println(m.matches());
    }
}
