package step_7_4_cloning.question02;

public class CatNew implements Cloneable {
    private int age;
    private String name;
    public CatNew(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return"Age = " + age + ", name = " + name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
