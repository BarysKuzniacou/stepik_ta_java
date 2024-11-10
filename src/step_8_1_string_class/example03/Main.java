package step_8_1_string_class.example03;

public class Main {
    public static void main(String[] args) {
        String str0 = "";
        String str1 = "Learning ";
        String str2 = "java!";
        String str3 = str1 + str2;
        String str4 = " ";
        String str5 = str0 + str1 + str2 + str4;

        System.out.println("str0 - " + str0.length() + " symbols");
        System.out.println("str1 - " + str1.length() + " symbols");
        System.out.println("str2 - " + str2.length() + " symbols");
        System.out.println("str3 - " + str3.length() + " symbols");
        System.out.println("str4 - " + str4.length() + " symbols");
        System.out.println("str5 - " + str5.length() + " symbols");
    }
}
