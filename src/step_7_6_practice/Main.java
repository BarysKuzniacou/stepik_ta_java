package step_7_6_practice;

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
        Quadrilateral qu = new Quadrilateral(new Point(1, 0), new Point(2, 1), new Point(1, 2), new Point(0, 1));
        Circle ci = new Circle(new Point(1, 1), 3);

        System.out.println(tr.area());
        System.out.println(qu.area());
        System.out.println(ci.area());

        System.out.println(tr.pointsToString());
        System.out.println(qu.pointsToString());
        System.out.println(ci.pointsToString());
    }
}

class Triangle extends Figure {
    Point pointA;
    Point pointB;
    Point pointC;

    public Triangle(Point a, Point b, Point c) {
        this.pointA = a;
        this.pointB = b;
        this.pointC = c;
    }

    @Override
    public double area() {
        /*
        0.5 * Math.abs((pointA.getX() - pointC.getX()) *
                (pointB.getY() - pointA.getY()) -
                (pointA.getX() - pointB.getX()) *
                (pointC.getY() - pointA.getY()));
        */
        return 0.5 * Math.abs(
                (pointA.getX() * (pointB.getY() - pointC.getY())) +
                (pointB.getX() * (pointC.getY() - pointA.getY())) +
                (pointC.getX() * (pointA.getY() - pointB.getY()))
        );
    }

    @Override
    public String pointsToString() {
        return "";
    }
}

class Quadrilateral extends Figure {
    Point a;
    Point b;
    Point c;
    Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        double side1, side2;
        double area;

        side1 = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        side2 = Math.sqrt(Math.pow(d.getX() - a.getX(), 2) + Math.pow(d.getY() - a.getY(), 2));

        area = side1 * side2;

        return area;
    }

    @Override
    public String pointsToString() {
        return "";
    }
}

class Circle extends Figure {
    Point pointCenter;
    double pointCircleX;

    public Circle(Point pointCenter, double pointX) {
        this.pointCenter = pointCenter;
        this.pointCircleX = pointX;
    }

    @Override
    public double area() {
        return Math.PI * (pointCircleX - pointCenter.getX());
    }

    @Override
    public String pointsToString() {
        return "";
    }
}

abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }
}


class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y +')';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
