package step_14_1_optional_class;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String s = String.valueOf(getClient());
        System.out.println(s);
    }

    public static Optional<String> getClient() {
        return Optional.empty();
    }
}
