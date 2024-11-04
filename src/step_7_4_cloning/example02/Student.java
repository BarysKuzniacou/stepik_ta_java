package step_7_4_cloning.example02;

import java.util.Date;

public class Student implements Cloneable {
    private Date yearSet;
    private int group;

    public Student(Date year, int group) {
        this.yearSet = year;
        this.group = group;
    }
    public String toString() {
        return "year = " + yearSet + ", group = " + group;
    }

    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.yearSet = (Date) this.yearSet;
        return student;
    }
}
