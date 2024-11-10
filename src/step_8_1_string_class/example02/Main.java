package step_8_1_string_class.example02;

public class Main {
    public static void main(String[] args) {
        String str1 = "Learning ";
        String str2 = "java!";

        String str3 = str1 + str2;

        System.out.println(str3);

        String str4 = new StringBuilder().append(str1).append(str2).toString();

        System.out.println(str4);

        /*
        В случае, если конкатенацию нужно осуществить только один раз – стоит использовать метод concat(), в других
        случаях рекомендуется использовать оператор "+" / "+=" или методы классов StringBuilder/StringBuffer.
         */
    }
}
