package step_11_2_generics_methods.Example01;

public class GenericMethod {
    public static <T> byte asByte(T num) {
        if (num instanceof Number) {
            return ((Number) num).byteValue();
        }
        return 0;
    }
}
