package step_8_2_StringBufferStringBuilder.questions;

public class Main01 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("I like Java.");//1
        StringBuilder sb2 = new StringBuilder(sb1);//2
        System.out.println(sb1.equals(sb2));
    }
}
