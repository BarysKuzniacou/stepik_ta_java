package step_8_3_regularExpressions.example11_replaceFirst;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main03 {
    /*
    String group() - возвращает всю подпоследовательность, удовлетворяющую шаблону или нулевой группе.

    String group(int group) - возвращает конкретную группу по позиции.

    int groupCount() - определяет число групп сбора, представленных в сопоставляемом шаблоне. Всегда существует группа 0,
    представляющая все выражение и не включаемая в счетчик групп.

    int start() - возвращает индекс первого символа подпоследовательности, удовлетворяющей шаблону.

    int start(int group) - возвращает индекс первого символа указанной группы.

    int end() - возвращает индекс последнего символа подпоследовательности, удовлетворяющей шаблону.

    int end(int group) - возвращает индекс последнего символа указанной группы.

    boolean hitEnd() - возвращает истину, если был достигнут конец входной последовательности.
     */
    public static void main(String[] args) {
        String base = "java";
        groupView(base, "([a-z]*)([a-z]+)");
        groupView(base, "([a-z]?)([a-z]+)");
        groupView(base, "([a-z]+)([a-z]*)");
        groupView(base, "([a-z]?)([a-z]?)");
        /*
        В первом случае к первой группе относятся все возможные символы, но при этом остается минимальное количество
        символов для второй группы.

        Во втором случае для первой группы выбирается наименьшее количество символов, так как используется слабое
        совпадение.

        В третьем случае первой группе будет соответствовать вся строка, а для второй не остается ни одного символа,
        так как вторая группа использует слабое совпадение.

        В четвертом случае строка не соответствует регулярному выражению, так как для двух групп выбирается наименьшее
        количество символов.

        Группа 0 всегда одинакова, так как представляет все выражение.
         */
    }
    private static void groupView(String base, String regExp) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(base);
        if (matcher.matches()) {
            System.out.println("group 1: " + matcher.group(1));
            System.out.println("group 2: " + matcher.group(2));
            System.out.println("main group: " + matcher.group() + " [end]");//eq.group(0)
        } else {
            System.out.println("nothing matches");
        }
    }
}
