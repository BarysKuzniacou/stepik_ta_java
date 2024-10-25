package step_6_5_polymorphism.information_01;

public class MainShapeSquare {
    public static void main(String[] args) {
        Shape shape = new Square();
        shape.draw();
        Shape postSquare = new PostSquare();
        postSquare.draw();
    }
}
