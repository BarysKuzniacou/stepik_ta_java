package step_3_5;

import java.util.Scanner;

public class MaximumNumberInSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentValue;
        int maxValue = Integer.MIN_VALUE;
        System.out.println(maxValue);
        boolean flag = true;

        while (flag == true) {
            currentValue = scanner.nextInt();
            if (currentValue == 0) {
                flag = false;
            } else {
                if (currentValue > maxValue) {
                    maxValue = currentValue;
                }
            }
        }
        System.out.println(maxValue);
    }
}
