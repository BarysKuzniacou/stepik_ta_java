package step_7_4_cloning.example03;

import java.sql.SQLOutput;

public class Mian {
    public static void main(String[] args) {
        ClassA obj01 = new ClassA();
        System.out.println(obj01);
        ClassA obj02 = new ClassA(obj01);
        System.out.println(obj02);
    }
}
