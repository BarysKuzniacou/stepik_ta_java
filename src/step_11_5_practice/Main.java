package step_11_5_practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House dogHouse = new House();
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        //dogHouse.enter(murzik);
        System.out.print(dogHouse);

        House catHouse = new House();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        //catHouse.enter(rex);
        System.out.print(catHouse);
    }
}

class House <T> {

    public final List<T> residents = new ArrayList<>();

    public void enter(Object resident) {
        residents.add((T) resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Object resident : residents) {
            builder.append(resident.toString()).append(" ");
        }
        return builder.toString() + "|";
    }
}

class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}

class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kitten " + name;
    }
}

class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}

class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Puppy " + name;
    }
}
