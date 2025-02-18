package step_13_2_creating_wrapper_class;

public class Main {
    public static void main(String[] args) {
        //конструктор с соответствующим примитивным типом
        Integer intObject1 = new Integer(100);
        Double doubleObject1 = new Double(0.01);
        //конструктор со строкой, описывающей значение примитивного типа
        Integer intObject2 = new Integer("100");
        Double doubleObject2 = new Double("0.01");

        System.out.println(intObject1 + intObject2);

        //статический метод valueof() с примитивным типом
        Integer intObject3 = Integer.valueOf(11);
        Double doubleObject3 = Double.valueOf(11.1);
        //статический метод valueof() со строкой, описывающей значение примитивного типа
        Integer intObject4 = Integer.valueOf("11");
        Double doubleObject4 = Double.valueOf("11.1");

        System.out.println(intObject3 + intObject4);

        //boolean
        Boolean b = new Boolean("true");
        Boolean b1 = new Boolean("false");
        Boolean b2 = Boolean.valueOf("no true");
        Boolean b3 = Boolean.TRUE;
        Boolean b4 = new Boolean("True");
        System.out.println(b + ", " + b1 + ", " + b2 + ", " + b3 + ", " + b4);

        //получить примитивное значение для числовых классов-оболочек из строки символов
        String str = "11";
        int number = Integer.parseInt(str);
        System.out.println(number);

        System.out.println(Integer.parseInt ("-123"));
        //System.out.println(Integer.parseInt ("12ABCD"));
        //System.out.println(Integer.parseInt ("123_45"));
        System.out.println(Integer.parseInt ("123"));
        System.out.println(Integer.parseInt ("+123"));

        //Character c1 = new Character(9);      //line1
        //Character c2 = new Character("a");    //line2
        //System.out.print(c1);
        //System.out.print(c2);

        Integer i2 = Integer.valueOf("0010", 2);
        System.out.print(i2);
    }
}
