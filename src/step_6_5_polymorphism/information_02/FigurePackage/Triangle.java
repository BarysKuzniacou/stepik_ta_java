package step_6_5_polymorphism.information_02.FigurePackage;

public class Triangle extends Figure{
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    public double area() {
        System.out.print("Площадь треугольника ");
        return dim1 * dim2 / 2;
    }
}
