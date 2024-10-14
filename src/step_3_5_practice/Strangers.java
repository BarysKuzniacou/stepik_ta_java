package step_3_5_practice;

import java.io.IOException;
import java.util.Scanner;

public class Strangers {
    public static void main(String[] args) throws IOException {
        String nameStrangers = null;
        int numberStrangers = 0;
        String[] names = null;
        Scanner scanner = new Scanner(System.in);

        try {
            numberStrangers = scanner.nextInt();
            if (numberStrangers < 0) {
                System.out.println("Серьезно? А что так негативно?");
            }
            if (numberStrangers == 0) {
                System.out.println("Оу... Похоже здесь никого...");
            }
            if (numberStrangers > 0) {
                try{
                    nameStrangers = scanner.nextLine();
                    names = nameStrangers.trim().split(" ");
                }
                catch (Exception e) {
                    System.out.println(e);
                }
                for (String name: names) {
                    System.out.println("Привет, " + name);
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
