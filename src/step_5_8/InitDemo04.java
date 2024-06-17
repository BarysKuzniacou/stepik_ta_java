package step_5_8;

public class InitDemo04 {
    private final int XX = 50;
    private final int ZZ;
    private final int YY;
    {
        ZZ = 20;
        System.out.println("Dynamic section");
    }
    public InitDemo04() {
        YY = 30;
        System.out.println("Constructor");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        InitDemo04 obj = new InitDemo04();
    }
}
