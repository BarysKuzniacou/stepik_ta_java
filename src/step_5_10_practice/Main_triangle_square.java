package step_5_10_practice;

import java.util.Scanner;

public class Main_triangle_square {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1x = scanner.nextInt();
        int p1y = scanner.nextInt();
        int p2x = scanner.nextInt();
        int p2y = scanner.nextInt();
        int p3x = scanner.nextInt();
        int p3y = scanner.nextInt();
        Point p1 = new Point(p1x, p1y);
        Point p2 = new Point(p2x, p2y);
        Point p3 = new Point(p3x, p3y);

        Triangle triangle = new Triangle(p1, p2, p3);
        if (triangle.isValid()) {
            System.out.println(triangle.area()); // This should output 6.0
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}

class Triangle {
    Point a, b, c;
    boolean valid;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.valid = this.isValid();
    }

    public boolean isValid() {
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        // Using the Shoelace formula to check if the area is zero
        double area = 0.5 * Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area > 0;
    }

    public double area() {
        if (!valid) {
            throw new IllegalStateException("Треугольник не существует");
        }

        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        return 0.5 * Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
    }
}

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
