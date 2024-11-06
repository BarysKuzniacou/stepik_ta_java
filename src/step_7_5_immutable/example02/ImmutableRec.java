package step_7_5_immutable.example02;

public record ImmutableRec(String name, int id) {
    public void method() {
        System.out.println("ImmutableRec method");
    }
}
