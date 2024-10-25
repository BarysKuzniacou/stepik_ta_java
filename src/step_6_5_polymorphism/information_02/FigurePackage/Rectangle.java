package step_6_5_polymorphism.information_02.FigurePackage;

public class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    public double area() {
        System.out.print("Площадь прямоугольника ");
        return dim1 * dim2;
    }
}
