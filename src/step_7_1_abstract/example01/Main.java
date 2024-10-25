package step_7_1_abstract.example01;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Boa();
        Reptile reptile = new Boa();
        Boa boa = new Boa();

        animal.move();
        //animal.speak();
        //System.out.println(animal.num);
        reptile.move();
        //reptile.speak();
        //System.out.println(reptile.num);
        boa.move();
        boa.speak();
        System.out.println(boa.num);


    }
}
