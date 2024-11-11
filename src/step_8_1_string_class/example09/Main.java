package step_8_1_string_class.example09;

public class Main {
    public static void main(String[] args) {
        /*
        %d – целое число (int, long, …)
        %f – вещественное число (float, double)
        %s – строка
        %c – символ
        %% – символ %
        %t – дата/время
        %b – булево значение
         */

        String formatString = "We are printing double variable (%f), string (\"%s\") and integer variable (%d).";
        System.out.println(String.format(formatString, 0.7, "Java", 10));
    }
}
