package step_3_5;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 0;
        while (a == 0) {
            a = scanner.nextDouble();
        }
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = (b * b) - (4 * a * c);

        if (D > 0) {
            double x1 = ((-b + Math.sqrt(D)) / (2 * a));
            double x2 = ((-b - Math.sqrt(D)) / (2 * a));
            System.out.println(Math.min(x1,x2) + " " + Math.max(x1,x2));
        } if (D == 0) {
            double x = - b / (2 * a);
            System.out.println(x);
        } else if (D < 0) {
            System.out.println("без корней");
        }
    }
}
