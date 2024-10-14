package step_3_4_cycles;

public class ContinueBreak {
    public static void main(String[] args) {
        int i = 0;
        outer: while (i++ < 3) {
            int j = 0;
            while (j++ < 5) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }
    }
}
