package step_7_5_immutable.example02;

public class ImmutableRec {
    public String name;
    public int id;

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public ImmutableRec(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
