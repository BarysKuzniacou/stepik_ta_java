package step_6_4_subclass_capabilities;

class Person {
    String version = "Person";
}
class Student extends Person {
    String version = "Student";
}

public class MainClassQuestions {
    public static void main(String[] args) {
        Person person = new Student ();
        System.out.println(person.version);
    }
}
