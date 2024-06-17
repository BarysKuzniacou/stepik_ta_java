package step_5_8;

public class InitDemo05 {
    private final int XX;
    {
        System.out.println("Dynamic section");
    }
    public InitDemo05() {
        System.out.println("Constructor");
        XX = 20;
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        InitDemo05 obj = new InitDemo05();
    }
}
