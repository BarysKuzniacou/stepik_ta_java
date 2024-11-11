package step_8_1_string_class.example06;

public class Main {
    public static void main(String[] args) {
        String str = "String in java is a sequence of characters java";
        int i1 = str.indexOf("java");
        int i2 = str.lastIndexOf("java");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(str.indexOf("java", 20));
        System.out.println(str.indexOf("in", 0));
    }
}
