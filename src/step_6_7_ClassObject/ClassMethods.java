package step_6_7_ClassObject;

public class ClassMethods {
    /*
    equals(Object obj) - возвращает результат сравнения двух объектов.

    hashCode() - возвращает уникальный идентификатор объекта()

    toString() - возвращает представление объекта в виде строки.

    clone() - возвращает созданную копию объекта.

    getClass() - возвращает объект типа Class (описание класса объекта).

    wait() - переводит поток в состояние ожидания.

    notify() - возобновляет (уведомляет) один из потоков, вызвавших метод wait() на этом же объекте.

    notifyAll() - возобновляет (уведомляет) все потоки, вызвавшие метод wait() на этом же объекте.

    finalize() - выполняет завершающую работу перед уничтожением объекта сборщиком мусора.
     */

    /*
    Метод hashCode() следует переопределять всегда, когда переопределен метод equals(Object).
    */

    /*
    При переопределении метода hashCode() нужно обязательно соблюдать три соглашения по переопределению хэш-кода, а именно:

    Если во время выполнения Java-приложения метод вычисления хэш-кода будет вызван на одном и том же объекте несколько раз, то он должен возвращать одно и то же значение, если только объект не изменялся.
    В случае, когда два объекта равны (результат вызова equals(Object) – true), то при вызове метода вычисления хэш-кода для каждого из этих двух объектов он должен возвращать один и тот же результат.
    В случае, когда два объекта не равны (результат вызова equals(Object) – false), то при вызове метода вычисления хэш-кода для каждого из этих двух объектов, желательно, чтобы он возвращал разные результаты.
    */

    /*
public class Student {
    private String name;
    private long phone;
    private int age;
    // …
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        result = 31 * result + age;
        return result;
    }
}
public class Demo9 {
    public static void main(String[] arg) {
        Student stud1 = new Student("Peter", 5558956L, 20);
        Student stud2 = new Student("Ivan", 9876543L, 18);
        Student stud3 = new Student("Dasha", 5558956L, 20);
        Student stud4 = new Student("Ivan", 9876543L, 18);
        System.out.println(stud1.hashCode());
        System.out.println(stud2.hashCode());
        System.out.println(stud3.hashCode());
        System.out.println(stud4.hashCode());
    }
}
Вывод в консоли:

1160475683
-1786389060
-1015000986
-1786389060
 */
}
