package step_7_2_interface.example01;

public class Main {
    public static void main(String[] args) {
        Square circle = new Circle(7.01);
        Perimeter perimeter = new Circle(2.01);
        System.out.println("Square: " + circle.getSquare());
        System.out.println("Perimeter: " + perimeter.getPerimeter());

        Square circle_1 = new Circle(2.01);
        Perimeter perimeter1 = (Perimeter) circle_1;

        System.out.println("Perimeter: " + perimeter1.getPerimeter());

    }
}
