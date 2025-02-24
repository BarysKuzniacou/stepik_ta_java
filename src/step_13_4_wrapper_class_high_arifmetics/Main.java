package step_13_4_wrapper_class_high_arifmetics;

import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        float res = 0.4f - 0.3f;
        BigDecimal big1 = new BigDecimal("0.4");
        BigDecimal big2 = new BigDecimal("0.3");
        BigDecimal bigRes = big1.subtract(big2, MathContext.DECIMAL32);
        System.out.println(res);
        System.out.println(bigRes);

        boolean res1 = 1.00000001f == 1.00000002f;
        System.out.println(res1);

        boolean res2 = 1 == 1f / 3 * 3;
        System.out.println(res2);
    }
}
