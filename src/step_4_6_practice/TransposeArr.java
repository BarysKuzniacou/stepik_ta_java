package step_4_6_practice;

import java.util.Scanner;

public class TransposeArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cols = scanner.nextInt();
        int rows = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transposeMatrix = new int[cols][rows];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[i].length; j++) {
                if (j != transposeMatrix[i].length - 1) {
                    System.out.print(transposeMatrix[i][j] + " ");
                } else {
                    System.out.print(transposeMatrix[i][j] + "");
                }
            }
            System.out.println();
        }
    }
}
