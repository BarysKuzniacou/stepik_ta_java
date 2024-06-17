package step_5_8;

public class InitDemo03 {
    private int a = 5; // Поле экземпляра класса
    private static int b = 100; // Поле класса
    {
        System.out.println("before Dynamic initialization section " + a + " " + b);
        a = -5;
        System.out.println("Dynamic initialization section");
    }
    public InitDemo03() {
        System.out.println("before Constructor " + a + " " + b);
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }
    static {
        System.out.println("before Static initialization section " + b);
        b = -5;
        System.out.println("Static initialization section " + b);
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        InitDemo03 obj = new InitDemo03();
        System.out.println("a=" + obj.a + " b=" + b);
    }
}
