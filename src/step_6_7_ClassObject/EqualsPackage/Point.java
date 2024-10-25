package step_6_7_ClassObject.EqualsPackage;

public class Point {
    protected int x;
    protected int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //Проверка идентичности ссылок
        if (obj == null) return false; //Проверка нулевой ссылки
        if (this.getClass() != obj.getClass()) return false; //Сравнение классов
        Point other = (Point) obj; //Преобразование в переменную
        return this.x == other.x && this.y == other.y; /*Сравнение полей
        eturn field1 == other.field1 && field2.equals(other.field2) && ...;
        */
    }
}
