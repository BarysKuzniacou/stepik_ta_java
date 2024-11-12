package step_8_2_StringBufferStringBuilder.example01;

public class Main {
    public static void main(String[] args) {
        String str = "S0";
        for (int i = 1; i <= 6; i++) {
            str += "m" + i;
        }
        System.out.println(str);
    }
}
