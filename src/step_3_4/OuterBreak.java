package step_3_4;

public class OuterBreak {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Start");
        outer: while ( i < 5) {
            int j = 0;
            while (j < 2) {
                j++;
                System.out.println("i=" + i + ", j=" + j);
                break outer;
            }
        }
        System.out.println("Finish");
    }
}
