package step_4_6_practice;

import java.util.Arrays;
import java.util.Scanner;

public class SumTwoPrevious {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean[] logicArr = new boolean[size];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == (arr[i-1] + arr[i-2])) {
                logicArr[i] = true;
            }
        }
        System.out.println(Arrays.toString(logicArr));
    }
}
