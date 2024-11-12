package step_8_2_StringBufferStringBuilder.example04;

import java.util.StringJoiner;

public class MainStringJoiner {
    public static void main(String[] args) {
        /*
        StringJoiner - класс для объединения нескольких строк в одну с заданием разделителя, префикса и суффикса.
        У класса два конструктора:
        StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
        StringJoiner(CharSequence delimiter).
         */
        StringJoiner joiner = new StringJoiner(":", "<<", ">>");
        String result = joiner.add("blanc").add("rouge").add("blanc").toString();
        System.out.println(result);
    }
}
