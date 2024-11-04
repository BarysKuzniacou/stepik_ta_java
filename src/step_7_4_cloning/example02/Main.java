package step_7_4_cloning.example02;

import java.util.Date;

public class Main {
    public static void main(String[] arg) throws Exception  {
        Date dd = new Date( System.currentTimeMillis() );
        Student stud1 = new Student(dd, 201);
        System.out.println(stud1);
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);
    }
}

/*
Выражение x.clone() != х должно генерировать true. Другими словами, ссылки на исходный объект и его клон должны
отличаться.
Выражение x.clone().getClass() == x.getClass() должно генерировать true. Другими словами, тип исходного объекта и клона
должен быть одним и тем же.
Вне всякого сомнения x.clone().equals(x) должно генерировать true. Другими словами, сравнив исходный объект и его клон,
вы должны получить информацию об их идентичности.

В языке Java уже реализовано поверхностное клонирование/копирование в методе класса Object - клонирование заключается в
получении копий полей, то есть:

если поля примитивных типов, то получим независимую новую копию
если есть ссылочные поля, то такие поля будут разделяться исходным объектом и его клоном (получаем не независимую
копию).
 */
