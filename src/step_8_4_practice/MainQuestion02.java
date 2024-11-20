package step_8_4_practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainQuestion02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        Pattern pattern = Pattern.compile("[ ,!;.:]+");
        String words[] = pattern.split(str);

        System.out.println(Arrays.toString(words));
    }
}
