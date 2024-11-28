package step_8_3_regularExpressions.RegExAdditionally;
/*
https://www.youtube.com/watch?v=WOYyYwNj7TU&list=PL786bPIlqEjQsE_WAcKpkZ-Q4T-A8j1D2
 */

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegExAd01 {
    public static void main(String[] args) {

        System.out.println("abc".matches("[a-zA-Z]*"));

        Pattern pattern = Pattern.compile("r");

        Matcher matcher = pattern.matcher("reqr");

        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }

    }
}
