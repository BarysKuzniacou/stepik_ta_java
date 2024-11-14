package step_8_3_regularExpressions.example02;

public class Main {
    public static void main(String[] args) {
        String s1 = "The root directory is \nWindows";
        String s2 = "The root directory is \u00A7Windows";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = "\\s";
        String s4 = "\"Windows\"";
        System.out.println(s3);
        System.out.println(s4);

        String s5 = "How\\?";

        System.out.println(s5);
    }
}
