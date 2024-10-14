package step_4_6_practice;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        size = scanner.nextInt();
        if (size == 0) {
            System.out.println("Массив нулевого размера");
        } else {
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println(max);
        }
    }
}
