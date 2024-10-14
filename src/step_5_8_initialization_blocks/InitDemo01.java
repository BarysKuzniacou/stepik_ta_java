package step_5_8_initialization_blocks;

public class InitDemo01 {
    private static int ii = initSt();

    private static int initSt() {
        System.out.println("Init ii value");
        return 1000;
    }

    public static void main(String[] arg) {
        System.out.println("Main");
        System.out.println("int: " + ii);
    }
}
