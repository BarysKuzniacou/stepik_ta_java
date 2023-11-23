package step_2_7.main;

import java.util.Scanner;

public class SetTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = 0;

        if (scanner.hasNextInt()) {
            seconds = scanner.nextInt();
        }

        scanner.close();

        int h = seconds/3600;
        int mm = (seconds%3600) / 60;
        int ss = seconds % 60;

        String hours = (h < 24)? "" + h: (h==24)? "0" :Integer.toString(h) ;
        System.out.printf ( hours + ":" + "%02d:%02d", mm, ss);
    }
}
