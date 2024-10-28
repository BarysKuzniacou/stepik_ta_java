package step_7_2_interface.example01;

public class Circle implements Square, Perimeter {
    double radius;
    double PI = Math.PI;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return PI*radius*radius;
    }

    public double getPerimeter() {
        return 2*PI*radius;
    }
}
