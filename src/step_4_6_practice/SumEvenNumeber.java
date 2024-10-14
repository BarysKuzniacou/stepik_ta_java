package step_4_6_practice;

import java.util.Scanner;

public class SumEvenNumeber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int sumEvenNumbers = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]%2) == 0) {
                sumEvenNumbers += arr[i];
            }
        }

        System.out.println(sumEvenNumbers);
    }
}
