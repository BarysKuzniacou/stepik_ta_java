package step_8_4_practice;

import java.util.Scanner;

public class MainQuestion01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numWords = scanner.nextInt();

        String[] words = new String[numWords];

        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.next();
        }

        String strWords = null;

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                strWords += "[";
            }
            strWords += words[i];
            if (i == words.length) {
                strWords += "]";
            }
        }

        System.out.println(strWords);

    }
}
