package step_5_8;

import java.util.Arrays;

public class InitDemo02 {
    private static char[] alph;
    static {
        System.out.println("Static initialization");
        alph = new char[26];
        int i = 0;
        for (char c = 'a'; i < alph.length; c++, i++) {
            alph[i] = c;
        }
    }
    public static void main(String[] arg) {
        System.out.println("Main method");
        System.out.print(Arrays.toString(alph));
    }
}
