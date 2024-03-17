package step_4_6;

import java.util.Scanner;

public class SpiralArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cols = scanner.nextInt();
        int rows = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        int num = 1;
        int topRow = 0, bottomRow = rows - 1;
        int leftCol = 0, rightCol = cols - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Заполняем верхнюю строку
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = num++;
            }
            topRow++;

            // Заполняем правый столбец
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = num++;
            }
            rightCol--;

            // Заполняем нижнюю строку
            for (int i = rightCol; i >= leftCol; i--) {
                matrix[bottomRow][i] = num++;
            }
            bottomRow--;

            // Заполняем левый столбец
            for (int i = bottomRow; i >= topRow; i--) {
                matrix[i][leftCol] = num++;
            }
            leftCol++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
