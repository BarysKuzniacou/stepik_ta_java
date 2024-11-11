package step_8_1_string_class.questions;

public class Main01 {
    public static void main(String[] args) {
        String s = new String("Java");
        String t = new String();
        String r = null;
        r = s + t + r;

        //r = s && t && r;

        r = s + t + 'r';

        //r = s & t & r;
    }
}
