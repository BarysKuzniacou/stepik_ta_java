package step_3_5;

import java.util.Scanner;

public class SnailAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepForward = scanner.nextInt();
        int stepBack = scanner.nextInt();
        int treeHeight = scanner.nextInt();
        int snailPath = 0;
        int dayAdventure = 0;

        if (stepForward > stepBack) {
            while (treeHeight > snailPath) {
                dayAdventure++;
                snailPath = snailPath + stepForward;
                if (treeHeight <= snailPath) {
                    System.out.println(dayAdventure);
                } else {
                    snailPath = snailPath - stepBack;
                }
            }
        } else if (treeHeight == snailPath || stepForward >= treeHeight) {
            System.out.println(1);
        } else {
            System.out.println("Никогда");
        }
    }
}
