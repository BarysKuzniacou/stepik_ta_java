package step_3_5_practice;

import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumValues = 0;
        int numberValues = 0;
        int currentValue;
        boolean flag = true;

        while (flag == true) {
            currentValue = scanner.nextInt();
            if (currentValue == 0) {
                flag = false;
            } else {
                sumValues += currentValue;
                numberValues++;
            }
        }
        int avgValue = sumValues/numberValues;
        System.out.println(avgValue);
    }
}
