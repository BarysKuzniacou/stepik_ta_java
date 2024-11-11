package step_8_1_string_class.example05;

public class Main {
    public static void main(String[] args) {
        String str = "Software And Hardware!";
        String substr1 = str.substring(13);
        System.out.println(substr1);
        System.out.println(str.substring(0, 8));
        System.out.println(str.substring(13, 17));
    }
}
