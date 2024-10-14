package step_5_10_practice;

import java.util.Scanner;

public class Main_Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        Line line1 = new Line(k1,b1);
        Line line2 = new Line(k2,b2);

        System.out.println(line1.intersection(line2));
    }
}

class Line {
    int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point_line intersection(Line other) {
        // If the slopes are equal, there is no single intersection point
        if (this.k == other.k) {
            return null;
        }
        // Calculate x coordinate of the intersection point
        double x = (double)(other.b - this.b) / (this.k - other.k);
        // Calculate y coordinate of the intersection point
        double y = this.k * x + this.b;
        // Return the intersection point (rounding to nearest integer)
        return new Point_line((int) Math.round(x), (int) Math.round(y));
    }

}

class Point_line {
    private final int x;
    private final int y;

    public Point_line(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}