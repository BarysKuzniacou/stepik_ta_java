package step_6_7_ClassObject.HashCodePackage;

public class Main {
    public static void main(String[] arg) {
        Point point1 = new Point(5, -5);
        Point point2 = point1; // Таким образом получим две ссылки на один объект
        Point point3 = new Point(5, -5); // Объект идентичен первым двум, но хэш-код будет другой
        Point point4 = new Point(5, 5);
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println(point3.hashCode());
        System.out.println(point4.hashCode());
    }
}