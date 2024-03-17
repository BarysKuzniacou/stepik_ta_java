package step_3_5;

import java.util.Scanner;

public class Password {
    final static int PASSWORD = 133976;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        int enterPassword = scanner.nextInt();
        switch (enterPassword) {
            case PASSWORD:
                System.out.println("Hello, Agent");
                break;
            default:
                System.out.println("Access denied");;
        };
    }
}
