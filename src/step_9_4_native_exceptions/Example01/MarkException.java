package step_9_4_native_exceptions.Example01;

public class MarkException extends Exception {
    @Override
    public String getMessage() {
        return "Недопустимое значение!";
    }
}
